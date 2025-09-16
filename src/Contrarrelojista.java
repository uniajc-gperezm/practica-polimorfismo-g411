import Ciclista.Ciclista;

public class Contrarrelojista extends Ciclista{

    //Variables
    private double velocidadMaxima;

    //Constructor
    public Contrarrelojista (int id, String nombre, double velocidadMaxima){
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;       
    }

    public double getVelocidadMaxima (){
        return velocidadMaxima;
    }

    public void setVelocidadMaxima (double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo(){
        return "El tipo es Contrarrelojista";
    }

    public void imprimirDatos (){
        super.imprimirDatos();
        System.out.println("Velocidad Maxima : " + this.velocidadMaxima );
    }
    
}

