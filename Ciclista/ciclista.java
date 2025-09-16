
public abstract class Ciclista {
    private String nombre;
    private int id;
    private int tiempoAcumuladoMinutos = 0;

    public Ciclista(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTiempoAcumuladoMinutos() {
        return tiempoAcumuladoMinutos;
    }

    public void setTiempoAcumuladoMinutos(int tiempo) {
        this.tiempoAcumuladoMinutos = tiempo;
    }

    public abstract String imprimirTipo();

    public void imprimirDatos() {
        
        System.out.println("---- Información del Ciclista ----");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Tiempo Acumulado (minutos): " + tiempoAcumuladoMinutos);
        
        
    }
}