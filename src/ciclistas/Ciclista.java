public abstract class Ciclista {
    private int indentificador;
    private String nombre;
    private int tiempoAcumulado;

    public int getIndentificador() {
        return this.indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
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
        this.indentificador = id;
        this.nombre = nombre;
    }

    public abstract String imprimirTipo ();

    public void imprimirDatos (){
        System.out.println("El idenitficador del ciclista es: " + indentificador);
        System.out.println("El nombre de ciclista es: " + nombre);
        System.out.println("El tiempo acumulado es de: " + tiempoAcumulado);
    }


}
