package Ciclista;

public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado;

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

    //metodo

    public Ciclista (int id , String nombre){
        this.identificador = id;
        this.nombre = nombre;
    }

    public abstract String imprimirTipo ();

    public void imprimirDatos (){
        System.out.println("El identificador del ciclista es: " + identificador);
        System.out.println("El nombre de ciclista es: " + nombre);
        System.out.println("El tiempo acumulado es de: " + tiempoAcumulado);
    }


}
