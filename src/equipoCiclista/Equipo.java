package equipoCiclista;

import java.util.ArrayList;
import java.util.Scanner;

import metodosCiclistas.Ciclista;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int sumaTiemposEquipo = 0;
    private ArrayList<Ciclista> listaCiclistas; // lista para guardar los ciclistas

    // constructor

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.listaCiclistas = new ArrayList<>();
    }

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

    public void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    // mostrar datos

    public void listarNombresCiclistas() {
        System.out.println("-----Nombre de los ciclistas del equipo " + this.nombreEquipo + "-----");
        for (Ciclista ciclista : listaCiclistas) {
            System.out.println("- " + ciclista.getNombre());
        }
    }

    // encontrar ciclista con id

    public void buscarCiclista() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\ningrese el identificador del ciclista: ");
        int idBuscado = sc.nextInt();
        Ciclista ciclistaEncontrado = null;

        for (Ciclista ciclista : listaCiclistas) {
            if (ciclista.getIdentificador() == idBuscado) {
                ciclistaEncontrado = ciclista;
                break;
            }
        }
        if (ciclistaEncontrado != null) {
            System.out.println("\nDatos del ciclista encontrado");
            ciclistaEncontrado.imprimirDatos();
            System.out.println(ciclistaEncontrado.imprimirTipo());
        } else {
            System.out.println("\nNo se encontro un ciclista con el #Identificador");
        }
    }

    // calcular tiempo

    public void calcularTotalTiempo() {
        sumaTiemposEquipo = 0;
        for (Ciclista ciclista : listaCiclistas) {
            sumaTiemposEquipo += ciclista.getTiempoAcumulado();
        }
    }

    // Muestra en pantalla los datos del equipo
    public void imprimirDatosEquipo() {
        System.out.println("--- Datos del Equipo ---");
        System.out.println("Nombre: " + this.nombreEquipo);
        System.out.println("País: " + this.pais);
        calcularTotalTiempo(); // Actualiza la suma de tiempos
        System.out.println("Tiempo total del equipo: " + sumaTiemposEquipo + " minutos");
    }
}
