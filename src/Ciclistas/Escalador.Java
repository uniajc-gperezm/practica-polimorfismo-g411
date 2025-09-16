public class Escalador extends Ciclista{
private float aceleracionPromedio;
private float gradoRampa;

	public float getAceleracionPromedio() {
		return this.aceleracionPromedio;
	}

	public void setAceleracionPromedio(float aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}

	public float getGradoRampa() {
		return this.gradoRampa;
	}

	public void setGradoRampa(float gradoRampa) {
		this.gradoRampa = gradoRampa;
	}

public Escalador (int id, String nombre, float aceleracion, float grado){
    super(id, nombre);
    this.aceleracionPromedio = aceleracion;
    this.gradoRampa = grado;

}

@Override
public String imprimirTipo (){
    return "Es un Escalador";
}

public void imprimirDatos(){
    super.imprimirDatos();
    System.out.println("La aceleracion es de: " + aceleracionPromedio);
    System.out.println("El grado es de: " + gradoRampa);
}




}