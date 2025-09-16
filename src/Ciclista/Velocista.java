package Ciclista;
public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    //constructor
    public Velocista (int id, String nombre, double potenciaPromedio, double velocidadPromedioSprint){
        super(id, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;    
    }

    public double getPotenciaPromedio (){
        return potenciaPromedio;
    }

    public void setPotenciaPromedio (double potenciaPromedio){
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint (){
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint (double velocidadPromedioSprint){
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    @Override
    public String imprimirTipo(){
        return "El tipo es Velocista";
    }

    public void imprimirDatos (){
        super.imprimirDatos();
        System.out.println("La potencia promedio " + this.potenciaPromedio);
        System.out.println("Velocidad Promedio Sprint" + this.velocidadPromedioSprint);
    }
}

