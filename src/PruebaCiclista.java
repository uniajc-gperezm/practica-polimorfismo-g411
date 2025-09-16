import equipoCiclista.Equipo;
import metodosCiclistas.*;

public class PruebaCiclista {
    public static void main(String[] args) {
        //1. se crea un equipo
        Equipo equipo = new Equipo("INEOS GRANDIORS", "COLOMBIA");

        //2. Se crean y agregan ciclistas de diferentes tipos
        Velocista v1= new Velocista(101, "Santiago", 450,78.5);
        v1.setTiempoAcumulado(320);

        Escalador e1 = new Escalador(202, "Egan Bernal", 8.5f, 15.0f);
        e1.setTiempoAcumulado(410);

        Contrarreloj c1 = new Contrarreloj(303, "Filippo Ganna", 62.1);
        c1.setTiempoAcumulado(290);
        
        equipo.añadirCiclista(v1);
        equipo.añadirCiclista(e1);
        equipo.añadirCiclista(c1);

        // 3. Se ejecutan las acciones solicitadas
        equipo.imprimirDatosEquipo();
        System.out.println(); // Salto de línea
        
        equipo.listarNombresCiclistas();
        System.out.println(); // Salto de línea

        // 4. Se busca un ciclista por ID (introducido por teclado)
        equipo.buscarCiclista(); 
        equipo.buscarCiclista(); 
    }
}
