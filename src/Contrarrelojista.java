public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Soy un Contrarrelojista";
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
