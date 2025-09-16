public abstract class ciclista {
    private String nombre;
    private int id;
    private int tiempoAcumuladoMinutos = 0;

    public ciclista(String nombre, int id) {
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

    public abstract void imprimirTipo();

    public void imprimirDatos() {
        System.out.println(
                "Ciclista: " + nombre + " | ID: " + id + " | Tiempo Acumulado: " + tiempoAcumuladoMinutos + " minutos");
    }
}