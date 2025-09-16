package Equipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ciclista.Ciclista;

public class Equipo  {
    private String nombre;
    private String pais;
    private List<Ciclista> ciclistas;
    private Scanner sc = new Scanner(System.in);
    private static int tiempoTotalEquipo; 

    public Equipo(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
        Equipo.tiempoTotalEquipo = 0;
        
    }
        protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    public void añadirCiclista(Ciclista ciclista){
        ciclistas.add(ciclista);

    }
    

    public void listarNombresCiclistas(){
        System.out.println("Lista de Ciclista que hacen parte del equipo " + this.nombre + ":");
        for (Ciclista ciclista : ciclistas) {
            System.out.println(" " + ciclista.getNombre());
            
        }

    }
      public void buscarCiclista() {
        //Scanner sc = new Scanner(System.in);

        System.out.println("\ningrese el identificador del ciclista: ");
        int idBuscado = sc.nextInt();
        Ciclista ciclistaEncontrado = null;

        for (Ciclista ciclista : ciclistas) {
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

     public void calcularTotalTiempos() {
      tiempoTotalEquipo = 0; // Se reinicia el contador estático
        for (Ciclista ciclista : ciclistas) {
            tiempoTotalEquipo += ciclista.getTiempoAcumulado();
     }

    }

     public void imprimirDatosEquipo() {
        System.out.println("\n===============================");
        System.out.println("Datos del Equipo");
        System.out.println("===============================");
        System.out.println("Nombre del Equipo: " + this.nombre);
        System.out.println("País: " + this.pais);
        System.out.println("Tiempo Total del Equipo: " + tiempoTotalEquipo + " minutos");
        System.out.println("-------------------------------");
    }

}
