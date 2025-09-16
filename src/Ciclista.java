public abstract class Ciclista {
    private int id;
    private String nombre;

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public abstract String imprimirTipo();

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
