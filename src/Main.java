public class Main {
    public static void main(String[] args) {
        Ciclista c1 = new Velocista(1, "Nairo", 400, 60);
        Ciclista c2 = new Escalador(2, "Rigo", 3.5, 12);
        Ciclista c3 = new Contrarrelojista(3, "Egan", 75);

        System.out.println(c1.getNombre() + ": " + c1.imprimirTipo());
        System.out.println(c2.getNombre() + ": " + c2.imprimirTipo());
        System.out.println(c3.getNombre() + ": " + c3.imprimirTipo());
    }
}
