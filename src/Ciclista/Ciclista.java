package Ciclista;
public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private int tiempoAcumulado;

    //CONSTRUCTOR
    public Ciclista(int id, String nombre){
        this.identificador = id;
        this.nombre = nombre;
    }
    //FIN CONSTRUCTOR
    
    public int getIdentificador() { 
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoAcumulado() {
        return this.tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    

    public abstract String imprimirTipo();

    public void imprimirDatos(){
        System.out.println("-----Información del ciclista-----");
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado);
    }
    
}