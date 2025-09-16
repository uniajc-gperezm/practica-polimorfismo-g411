import Ciclista.Contrarrelojista;
import Ciclista.Escalador;
import Ciclista.Velocista;
import Equipo.Equipo;

public class Main {
  public static void main(String[] args) {
     // 1. Crear un equipo
        Equipo equipo = new Equipo("Movistar Team", "España");

        // 2. Crear y agregar ciclistas de diferentes tipos
        Velocista velocista1 = new Velocista(101, "Fernando Gaviria", 400.0, 75.0);
        velocista1.setTiempoAcumulado(180);

        Escalador escalador1 = new Escalador(202, "Nairo Quintana", 25.0f, 10.0f);
        escalador1.setTiempoAcumulado(320);
        
        Contrarrelojista cr1 = new Contrarrelojista(303, "Filippo Ganna", 55.0);
        cr1.setTiempoAcumulado(150);
        
        equipo.añadirCiclista(velocista1);
        equipo.añadirCiclista(escalador1);
        equipo.añadirCiclista(cr1);

        // 3. Probar los métodos del equipo
        equipo.imprimirDatosEquipo(); // Imprime datos iniciales (tiempo 0)
        System.out.println();

        equipo.calcularTotalTiempos(); // Calcula la suma de tiempos
        
        equipo.listarNombresCiclistas(); // Muestra la lista de nombres
        System.out.println();

        // 4. Buscar e imprimir datos de un ciclista (uno que existe y uno que no)
        equipo.buscarCiclista(); // Buscar a Nairo Quintana
        equipo.buscarCiclista(); // Buscar un ciclista que no existe
        
        // 5. Demostración del método imprimirTipo() de un ciclista
        //System.out.println("\n--- Tipo de Ciclista ---");
        //System.out.println(velocista1.getNombre() + ": " + velocista1.imprimirTipo());
    

  }
}