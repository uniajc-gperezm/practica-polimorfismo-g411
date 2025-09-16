package Ciclista;
public class Escalador extends Ciclista {

    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int id, String nombre, float aceleracion, float rampa) {
        super(id, nombre);
        this.aceleracionPromedio = aceleracion;
        this.gradoRampa = rampa;
    }
    
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

    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Su aceleración promedio en subida es de: " + aceleracionPromedio);
        System.out.println("El grado de rampa soportada por el ciclista es de: " + gradoRampa);
    }

}
