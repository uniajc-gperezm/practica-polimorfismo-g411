package ciclista;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedioSprint) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    public void imprimirTipo() {
        
    }

    public void imprimirDatos() {

    }
}
