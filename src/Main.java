class Animal {

  public String nombre = "Animal";

  public void hacerSonido() {
    System.out.println("El animal hace un sonido.");
  }
}

class Perro extends Animal {

  public String nombre = "Pepito";

  @Override
  public void hacerSonido() {
    System.out.println("El perro dice: Guau!");
  }

  public void mostrarTruco() {
    System.out.println("El perro hace un truco.");
  }
}

public class Main {
  public static void main(String[] args) {
    // Conversion ascendente (upcasting) - implícita Un objeto Perro se trata como
    // un Animal
    Animal miAnimal = new Perro(); // Crea un objeto Animal

    Animal miPerros = miAnimal;

    System.out.println(miAnimal);
    System.out.println(miPerros);

    // Conversion descendente (downcasting) - explícita Un objeto Animal se trata
    // como un Perro
    // Ahora miAnimal apunta a un objeto Animal, no a un Perro
    if (miAnimal instanceof Perro) {
      Perro miPerro = (Perro) miAnimal; // Esto lanzará una excepción en tiempo de ejecución
      miPerro.hacerSonido(); // Muestra "El perro dice: Guau!"
      miPerro.mostrarTruco(); // Error en tiempo de ejecución
    } else {
      System.out.println("miAnimal no es una instancia de Perro.");
    }

  }
}