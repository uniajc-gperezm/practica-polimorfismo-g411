package Ciclista;

public abstract class Ciclista {

    //Variables
    private int identificador;
    private String nombre;
    private int tiempoAcumulado= 0;

    //Constructor
    public Ciclista (int id, String nombre){
        this.identificador = id;
        this.nombre = nombre;
    }

    public int getIdentificador (){
        return identificador;
    }

    public void setIdentificador (int id){
        this.identificador = id;

    }

    public String getNombre (){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public int getTiempoAcumulado (){
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado (int tiempoAcumulado){
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public abstract String imprimirTipo();
    
    public void imprimirDatos (){
        System.out.println("Identificador : " + this.identificador);
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Tiempo Acumulado : " + this.tiempoAcumulado);
    }

}