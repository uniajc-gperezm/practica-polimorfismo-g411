import Ciclista.Ciclista;
import Ciclista.Contrarrelojista;
import Ciclista.Escalador;
import Ciclista.Velocista;
import Equipo.Equipo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc, opc2, opc3, opc4, id;
        String nombreCiclista;
        boolean bool = true;

        // Assuming Equipo has a constructor `Equipo(String nombre, String pais)`
        Equipo equipo1 = new Equipo("INEOS", "Inglaterra");
        Equipo equipo2 = new Equipo("Team Visma", "Holanda");

        do {
            System.out.println("\n-----Bienvenido a la base de datos de los equipos de ciclistas-----");
            System.out.println("1. Ver Equipos");
            System.out.println("2. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("\n1. " + equipo1.getNombreEquipo());
                    System.out.println("2. " + equipo2.getNombreEquipo());
                    System.out.print("Seleccione un equipo: ");
                    opc2 = sc.nextInt();
                    
                    Equipo equipoSeleccionado = null;
                    if (opc2 == 1) {
                        equipoSeleccionado = equipo1;
                    } else if (opc2 == 2) {
                        equipoSeleccionado = equipo2;
                    } else {
                        System.out.println("Opción de equipo no válida.");
                        continue; // Go back to the main menu
                    }

                    System.out.println("\n¿Qué desea hacer?");
                    System.out.println("1. Ver datos del equipo");
                    System.out.println("2. Ver integrantes del equipo");
                    System.out.println("3. Añadir ciclista");
                    System.out.println("4. Buscar Ciclista por identificador");
                    opc3 = sc.nextInt();
                    sc.nextLine(); // Consume newline left-over

                    switch (opc3) {
                        case 1:
                            equipoSeleccionado.imprimirDatosEquipo();
                            break;
                        case 2:
                            equipoSeleccionado.listarNombresCiclistas();
                            break;
                        case 3:
                            System.out.println("¿Qué tipo de ciclista es?");
                            System.out.println("1. Velocista");
                            System.out.println("2. Escalador");
                            System.out.println("3. Contrarrelojista");
                            opc4 = sc.nextInt();
                            sc.nextLine(); // Consume newline

                            System.out.println("Digite el ID del ciclista:");
                            id = sc.nextInt();
                            sc.nextLine(); // Consume newline

                            System.out.println("Digite el nombre del ciclista:");
                            nombreCiclista = sc.nextLine();

                            switch (opc4) {
                                case 1:
                                    System.out.println("Digite la potencia promedio (watts):");
                                    double potencia = sc.nextDouble();
                                    System.out.println("Digite la velocidad promedio (km/h):");
                                    double velocidad = sc.nextDouble();
                                    equipoSeleccionado.añadirCiclista(new Velocista(id, nombreCiclista, potencia, velocidad));
                                    break;
                                case 2:
                                    System.out.println("Digite la aceleración en subida (m/s²):");
                                    float aceleracion = sc.nextFloat();
                                    System.out.println("Digite el grado de rampa (%):");
                                    float rampa = sc.nextFloat();
                                    equipoSeleccionado.añadirCiclista(new Escalador());
                                    break;
                                case 3:
                                    System.out.println("Digite la velocidad máxima (km/h):");
                                    double velocidadM = sc.nextDouble();
                                    equipoSeleccionado.añadirCiclista(new Contrarrelojista());
                                    break;
                                default:
                                    System.out.println("Tipo de ciclista no válido. No se añadió ningún ciclista.");
                            }
                            break;
                        case 4:
                            System.out.println("Digite el identificador del ciclista:");
                            id = sc.nextInt();
                            equipoSeleccionado.imprimirDatosCiclistaPorId(id);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                case 2:
                    System.out.println("Adiós!!");
                    bool = false;
                    break;
                default:
                    System.out.println("Digite una opción válida");
            }
        } while (bool);

        sc.close();
    }
}