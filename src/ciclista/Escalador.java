package ciclista;

public class Escalador extends Ciclista {

    private float aceleraciónPromedio;
    private float gradoRampa;

    public Escalador(int identificador, String nombre, float aceleraciónPromedio, float gradoRampa) {
        super(identificador, nombre);
        this.aceleraciónPromedio = aceleraciónPromedio;
        this.gradoRampa = gradoRampa;
    }

    public float getAceleraciónPromedio() {
        return aceleraciónPromedio;
    }

    public void setAceleraciónPromedio(float aceleraciónPromedio) {
        this.aceleraciónPromedio = aceleraciónPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public void imprimirTipo() {
        
    }

    public void imprimirDatos() {

    }
}
