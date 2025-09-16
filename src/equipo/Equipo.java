package equipo;
import java.util.ArrayList;

import ciclista.Ciclista;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private ArrayList<Ciclista> ciclistas;
    private static int tiempoTotal = 0;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public void imprimirEquipo() {
        System.out.println("\nEquipo: " + nombreEquipo + " | País: " + pais);
        System.out.println("Tiempo total: " + tiempoTotal + " min");
    }

    public void añadirCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    public void calcularTotalTiempos() {
        tiempoTotal = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotal += c.getTiempoAcumulado();
        }
    }

    public void listarNombresCiclistas() {
        System.out.println("\nCiclistas del equipo " + nombreEquipo + ":");
        for (Ciclista c : ciclistas) {
            System.out.println("- " + c.getNombre());
        }
    }

    public void buscarCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                System.out.println("\nDatos del ciclista con ID " + id + ":");
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("\nNo se encontró un ciclista con ID " + id);
    }

    public String getNombreEquipo() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getNombreEquipo'");
    }
}

