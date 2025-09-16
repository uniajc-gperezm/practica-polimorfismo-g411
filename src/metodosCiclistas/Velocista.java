package metodosCiclistas;
public class Velocista extends Ciclista{
    private double potenciaPromedio; // en vatios
    private double velocidadPromedio; // en km/h

    public Velocista (int identificador, String nombre, double potenciaPromedio, double velocidadPromedio){
        super(identificador, nombre);
        this.potenciaPromedio= potenciaPromedio;
        this.velocidadPromedio= velocidadPromedio;
    }

    //getter y setters 

    public double getPotenciaPromedio() {
        return this.potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return this.velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String imprimirTipo (){
        return "Es un velocista";
    }

    @Override
    public void imprimirDatos (){
        super.imprimirDatos();
        System.out.println("Potencia promedio: "+ potenciaPromedio+ " vatios");
        System.out.println("velocidad Sprint: " + velocidadPromedio + " km/h");
    }
}
   

