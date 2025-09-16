import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private List<Ciclista> ciclistas = new ArrayList<>();

    protected String getNombreEquipo() {
        return this.nombreEquipo;
    }

    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected String getPais() {
        return this.pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    protected void setTiempoTotalEquipo(int tiempo) {
        this.tiempoTotalEquipo = tiempo;
    }

    protected List<Ciclista> getCiclistas() {
        return this.ciclistas;
    }

    protected void setCiclistas(List<Ciclista> ciclistas) {
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
