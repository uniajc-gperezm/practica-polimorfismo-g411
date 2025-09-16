
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private String paisOrigen;
    private static int tiempoTotalEquipo;
    private List<ciclista> ciclistas;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public static void setTiempoTotalEquipo(int tiempo) {
        Equipo.tiempoTotalEquipo = tiempo;
    }

    public List<ciclista> getCiclistas() {
        return ciclistas;
    }

    public void setCiclistas(List<ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }

    public void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo + " | País de Origen: " + paisOrigen
                + " | Tiempo Total del Equipo: " + tiempoTotalEquipo + " minutos");
        System.out.println("Ciclistas del equipo:");
        for (ciclista c : ciclistas) {
            c.imprimirDatos();
        }
    }

    public void listarNombresCiclistas() {
        System.out.println("Nombres de los ciclistas en el equipo " + nombreEquipo + ":");
        for (ciclista c : ciclistas) {
            System.out.println("- " + c.getNombre());
        }
    }

    public void imprimirDatosCiclistaPorid(int id) {
        for (ciclista c : ciclistas) {
            if (c.getId() == id) {
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("No se encontró un ciclista con ID: " + id);
    }
}
