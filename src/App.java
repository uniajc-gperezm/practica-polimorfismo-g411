import Ciclista.Ciclista;
import Ciclista.Contrarrelojista;
import Ciclista.Escalador;
import Ciclista.Velocista;
import Equipo.Equipo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opc;
        int opc2;
        int opc3;
        int opc4;
        boolean bool = true;
        int id;
        String nombreCiclista;

        Equipo equipo1 = new Equipo();
        equipo1.setNombreEquipo("INEOS");
        equipo1.setPais("Inglaterra");

        Equipo equipo2 = new Equipo();
        equipo2.setNombreEquipo("Team Visma");
        equipo2.setPais("Holanda");

        do {
            System.out.println("-----Bienvenido a la base de datos de los equipos de ciclistas-----");
            System.out.println("1. Ver Equipos");
            System.out.println("2. salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("1. " + equipo1.getNombreEquipo());
                    System.out.println("2. " + equipo2.getNombreEquipo());
                    System.out.print("Seleccione un equipo:");
                    opc2 = sc.nextInt();
                    switch (opc2) {
                        case 1 -> {
                            System.out.println("Que desea hacer?");
                            System.out.println("1. Ver datos del equipo");
                            System.out.println("2. Ver integrantes del equipo");
                            System.out.println("3. Añadir ciclista");
                            System.out.println("4. Buscar Ciclista por identificador");
                            opc3 = sc.nextInt();
                            switch (opc3) {
                                case 1 -> equipo1.imprimirDatosEquipo();
                                case 2 -> equipo1.listarNombresCiclistas();
                                case 3 -> {
                                    System.out.println("que tipo de ciclista es?");
                                    System.out.println("1. Velocista");
                                    System.out.println("2. Escalador");
                                    System.out.println("3. Contrarrelojista");
                                    opc4 = sc.nextInt();
                                    switch (opc4) {
                                        case 1 -> {
                                            System.out.println("Digite el id del ciclista");
                                            id = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Digite el nombre del ciclista");
                                            nombreCiclista = sc.nextLine();
                                            System.out.println("Digite la potencia promedio del ciclista");
                                            double potencia = sc.nextDouble();
                                            System.out.println("Digite la velocidad promedio del ciclista");
                                            double velocidad = sc.nextDouble();
                                            Ciclista velocista = new Velocista(id, nombreCiclista, potencia, velocidad);
                                            equipo1.añadirCiclista(velocista);
                                        }
                                        case 2 -> {
                                            System.out.println("Digite el id del ciclista");
                                            id = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Digite el nombre del ciclista");
                                            nombreCiclista = sc.nextLine();
                                            System.out.println("Digite la aceleración promedio en subida del ciclista");
                                            float aceleracion = sc.nextFloat();
                                            System.out.println("Digite el grado de rampa soportado por el ciclista");
                                            float rampa = sc.nextFloat();
                                            Ciclista escalador = new Escalador(id, nombreCiclista, aceleracion, rampa);
                                            equipo1.añadirCiclista(escalador);
                                        }
                                        case 3 -> {
                                            System.out.println("Digite el id del ciclista");
                                            id = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Digite el nombre del ciclista");
                                            nombreCiclista = sc.nextLine();
                                            System.out.println("Digite la velocidad máxima del ciclista");
                                            double velocidadM = sc.nextFloat();
                                            Ciclista contrarrelojista = new Contrarrelojista(id, nombreCiclista,
                                                    velocidadM);
                                            equipo1.añadirCiclista(contrarrelojista);
                                        }
                                        default -> {
                                        }
                                    }
                                }
                                case 4 -> {
                                    System.out.println("Digite el identificador del ciclista");
                                    int ident = sc.nextInt();
                                    equipo1.imprimirDatosCiclistaPorId(ident);
                                }

                                default -> {
                                }
                            }
                        }

                        case 2 -> {
                            System.out.println("Que desea hacer?");
                            System.out.println("1. Ver datos del equipo");
                            System.out.println("2. Ver integrantes del equipo");
                            System.out.println("3. Añadir ciclista");
                            System.out.println("4. Buscar Ciclista por identificador");
                            opc3 = sc.nextInt();
                            switch (opc3) {
                                case 1 -> equipo2.imprimirDatosEquipo();
                                case 2 -> equipo2.listarNombresCiclistas();
                                case 3 -> {
                                    System.out.println("que tipo de ciclista es?");
                                    System.out.println("1. Velocista");
                                    System.out.println("2. Escalador");
                                    System.out.println("3. Contrarrelojista");
                                    opc4 = sc.nextInt();
                                    switch (opc4) {
                                        case 1 -> {
                                            System.out.println("Digite el id del ciclista");
                                            id = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Digite el nombre del ciclista");
                                            nombreCiclista = sc.nextLine();
                                            System.out.println("Digite la potencia promedio del ciclista");
                                            double potencia = sc.nextDouble();
                                            System.out.println("Digite la velocidad promedio del ciclista");
                                            double velocidad = sc.nextDouble();
                                            Ciclista velocista = new Velocista(id, nombreCiclista, potencia, velocidad);
                                            equipo2.añadirCiclista(velocista);
                                    }
                                        case 2 -> {
                                            System.out.println("Digite el id del ciclista");
                                            id = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Digite el nombre del ciclista");
                                            nombreCiclista = sc.nextLine();
                                            System.out.println("Digite la aceleración promedio en subida del ciclista");
                                            float aceleracion = sc.nextFloat();
                                            System.out.println("Digite el grado de rampa soportado por el ciclista");
                                            float rampa = sc.nextFloat();
                                            Ciclista escalador = new Escalador(id, nombreCiclista, aceleracion, rampa);
                                            equipo2.añadirCiclista(escalador);
                                    }
                                        case 3 -> {
                                            System.out.println("Digite el id del ciclista");
                                            id = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Digite el nombre del ciclista");
                                            nombreCiclista = sc.nextLine();
                                            System.out.println("Digite la velocidad máxima del ciclista");
                                            double velocidadM = sc.nextFloat();
                                            Ciclista contrarrelojista = new Contrarrelojista(id, nombreCiclista,
                                                    velocidadM);
                                            equipo2.añadirCiclista(contrarrelojista);
                                    }
                                        default -> {
                                    }
                                    }
                                }
                                case 4 -> {
                                    System.out.println("Digite el identificador del ciclista");
                                    int ident = sc.nextInt();
                                    equipo2.imprimirDatosCiclistaPorId(ident);
                                }

                                default -> {
                                }
                            }
                        }

                        default -> {
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Adiós!!");
                    bool = false;
                }
                default -> System.out.println("Digite una opción válida");
            }
        } while (bool);

    }
}
