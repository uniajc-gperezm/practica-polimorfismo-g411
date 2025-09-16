import Equipo.Equipo;

public class Prueba {
    public static void main(String[] args) {
        //Crear  equipo
        Equipo equipo1 = new Equipo("Leones", "Colombia");

        //ciclistas
        Velocista velocista1 = new Velocista(1, "Alexander", 2000.0, 47.0);
        Escalador escalador1 = new Escalador(2, "David", 3.7f, 20.0f);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(3, "Fernando", 60.0);

        //Acumular tiempo  ciclistas
        velocista1.setTiempoAcumulado(135);
        escalador1.setTiempoAcumulado(117);
        contrarrelojista1.setTiempoAcumulado(155);

        // Agregar ciclistas al equipo
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);

        //Imprimir datos
        System.out.println("--- Datos del Equipo ---");
        equipo1.imprimirDatosEquipo();

        //Listar nombre
        System.out.println("\n--- Lista de Nombres de los ciclistas---");
        equipo1.listarNombresCiclistas();

        //Buscar Ciclista
        System.out.println("\n Búsqueda por Id = David");
        equipo1.imprimirDatosCiclistaPorId(2);

        //Buscar ciclista
        System.out.println("\n Búsqueda por Id = Alexander");
        equipo1.imprimirDatosCiclistaPorId(1);

        //Probar en caso de que  no hayan ciclistas
        System.out.println("\n--- Búsqueda por ID pero que no esta ) ---");
        equipo1.imprimirDatosCiclistaPorId(125);
    }
}