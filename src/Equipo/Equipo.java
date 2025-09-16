package Equipo; //INDICA EL PAQUETE 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ciclista.Ciclista;

public class Equipo {
    //Variables
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private List<Ciclista> ciclistas;

    //Constructor
     public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }
    
    //Get y set
    public String getNombreEquipo (){
        return nombreEquipo;
    }

    public void setNombreEquipo (String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais () {
        return pais;
    }

    public void setPais (String pais){
        this.pais = pais;
    }

    public static int getTiempoTotalEquipo (){
        return tiempoTotalEquipo;
    }

    public static void setTiempoTotalEquipo ( int tiempoTotalEquipo){  //que pertenece a la CLASE Equipo, no a una instancia específica.
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public void añadirCiclista(Ciclista ciclista) {
        this.ciclistas.add(ciclista);
        Equipo.tiempoTotalEquipo += ciclista.getTiempoAcumulado();
    }

    public void imprimirDatosEquipo() {
        System.out.println("Nombre del Equipo: " + this.nombreEquipo);
        System.out.println("País: " + this.pais);
        System.out.println("Tiempo Total del Equipo: " + Equipo.tiempoTotalEquipo + " minutos");
    }

    public void listarNombresCiclistas() {
        System.out.println("Nombres de los ciclistas del equipo : \n");   
       
        for (int i = 0; i < this.ciclistas.size(); i++) {
            
            Ciclista ciclista = this.ciclistas.get(i);
        
            
            System.out.println(ciclista.getNombre());
        }
    }

    public void imprimirDatosCiclistaPorId(int id) {
        for (int i = 0; i < this.ciclistas.size(); i++) {
        
            Ciclista ciclista = this.ciclistas.get(i);
        
        
            if (ciclista.getIdentificador() == id) {
            
                ciclista.imprimirDatos();
                System.out.println(ciclista.imprimirTipo());
                return;
            }
        }
        
        System.out.println("No se encontró ningún ciclista con el ID: " + id);
    }
    
}