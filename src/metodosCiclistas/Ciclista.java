package metodosCiclistas;

public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado= 0;

    //Constructor
    public Ciclista(int identificador, String nombre){
        this.identificador = identificador;
        this.nombre = nombre;
    }

    //metodos
    
    public int getIdentificador (){
        return identificador;
    }

    public void setIdentificador (int identificador){
        this.identificador = identificador;
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

    // metodo abstracto para imprimirTipo

    public abstract String imprimirTipo();

    //metodo para imprimir los datos

    public void imprimirDatos(){
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado + " minutos");
    }

}
