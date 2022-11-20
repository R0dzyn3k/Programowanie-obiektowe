public class Main {

    public static void main(String[] args) {

        Punkt pk1 = new Punkt(2.3, 3.5);
        System.out.printf(pk1.opis());
        pk1.przesun(1.2,-2);
        System.out.printf(pk1.opis());

        Prostokat p1 = new Prostokat(2, 4);
        Trojkat t1 = new Trojkat(5, 2.5);
        Figura f1 = new Figura();

        System.out.println("\nPole prostokata: " + p1.getPowierzchnia());
        System.out.println(f1.opis());


    }
}