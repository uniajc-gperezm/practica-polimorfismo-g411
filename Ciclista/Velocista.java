public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    public Velocista(String nombre, int id, double potenciaPromedio, double velocidadPromedioSprint) {
        super(nombre, id);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
}