package ciclista; 
public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    public Velocista(int id, String nombre, double potencia, double velocidad) {
        super(id, nombre);
        this.potenciaPromedio = potencia;
        this.velocidadPromedioSprint = velocidad;
    }

    public double getPotenciaPromedio() {
        return this.potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return this.velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Su potencia promedio es de: " + potenciaPromedio);
        System.out.println("Su velocidad promedio por sprint es de: " + velocidadPromedioSprint);
    }

}