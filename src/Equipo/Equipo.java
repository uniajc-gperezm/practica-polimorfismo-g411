package Equipo;
import Ciclista.Ciclista;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private List<Ciclista> ciclistas = new ArrayList<>();

    public String getNombreEquipo() {
        return this.nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public void setTiempoTotalEquipo(int tiempo) {
        this.tiempoTotalEquipo = tiempo;
    }

    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public void imprimirDatosEquipo() {
        System.out.println("-----Información de equipo-----");
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo);
    }

    public void listarNombresCiclistas() {
        System.out.println("-----Integrantes-----");
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }

    public void imprimirDatosCiclistaPorId(int id) {
        int contador = 0;
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                contador++;
                break;
            }
        }
        if (contador == 0) {
            System.out.println("No se encontró ningún ciclista con el ID: " + id);
        }

    }

}