public class Escalador extends Ciclista {
    private double aceleracionPromedio;
    private double gradoRampa;

    public Escalador(int id, String nombre, double aceleracionPromedio, double gradoRampa) {
        super(id, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "Soy un Escalador";
    }

    public double getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public double getGradoRampa() {
        return gradoRampa;
    }
}
