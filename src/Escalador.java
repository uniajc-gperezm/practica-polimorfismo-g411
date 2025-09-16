import Ciclista.Ciclista;

public class Escalador extends Ciclista {

    //Variables
    private float aceleracionPromedio;
    private float gradoRampa;

    //Constructor
    public Escalador (int id, String nombre, float aceleracionPromedio, float gradoRampa){
        super(id, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;        
    }

     public float getAceleracionPromedio (){
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio (float aceleracionPromedio){
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa (){
        return gradoRampa;
    }

    public void setGradoRampa (float gradoRampa){
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo(){
        return "El tipo es Escalador";
    }

    public void imprimirDatos (){
        super.imprimirDatos();
        System.out.println("Aceleracion Promedio : " + this.aceleracionPromedio);
        System.out.println("Grado Rampa : " + this.gradoRampa);
    }
}