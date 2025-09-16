package metodosCiclistas;

public class Contrarreloj extends Ciclista {
    private double velocidadMaxima;

    public Contrarreloj (int identificador, String nombre, double velocidadMaxima0){
        super(identificador, nombre);
        this.velocidadMaxima= velocidadMaxima;
    }


    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    @Override
    public String imprimirTipo() {
        return "Es contrareloj";
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("velocidad maxima: " + velocidadMaxima + " Km/h");
    }
}
