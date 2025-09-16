public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;

	public double getVelocidadMaxima() {
		return this.velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


    public Contrarrelojista (int id, String nombre, double velocidadMaxima){
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
public String imprimirTipo (){
    return "Es un Contrarrelojista";
}

public void imprimirDatos(){
    super.imprimirDatos();
    System.out.println("Su velocidadMaxima es de: " + velocidadMaxima);
    
}

}