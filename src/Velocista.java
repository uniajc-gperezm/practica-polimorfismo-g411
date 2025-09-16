public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int id, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(id, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String imprimirTipo() {
        return "Soy un Velocista";
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }
}
