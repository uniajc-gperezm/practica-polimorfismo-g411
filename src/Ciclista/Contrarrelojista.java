package Ciclista;
public class Contrarrelojista extends Ciclista {

    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidadM) {
        super(id, nombre);
        this.velocidadMaxima = velocidadM;
    }

    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    @Override
    public String imprimirTipo() {
        return "Es un Contrarrelojista";
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Su velocidad máxima es de: " + velocidadMaxima);
    }

}
