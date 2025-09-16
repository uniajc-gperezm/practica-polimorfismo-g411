package equipos;
import java.util.ArrayList;
import java.util.List;

import ciclistas.Ciclista;

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

    public List<Ciclista> getCiclistas() {
        return this.ciclistas;
    }

    public void setCiclistas(List<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }
     
    //Metodo 

    public void añadirCiclista (Ciclista añadir){
        ciclistas.add(añadir);
    }

    public void imprimirDatosEquipo (){
        System.out.println("Nombre del equipo:" + nombreEquipo);
        System.out.println("El pais es: " + pais);
        System.out.println("El tiempo total del equipo es de: " + tiempoTotalEquipo);
    } 

    public void listarNombreCiclistas (){
        
    }

    

}
