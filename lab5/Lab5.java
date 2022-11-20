import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Prostokat p1 = new Prostokat( 5, 10 );
        System.out.printf("Pole podanego prostokata wynosi: "+ p1.pole() + "\n");
        System.out.printf("Obw podanego prostokata wynosi: "+ p1.obw() +"\n");
        System.out.printf("Przekatna podanego prostokata wynosi: "+ p1.przekatna()+ "\n");

        Budynek b1 = new Budynek("nazwa",
                4,
                LocalDate.of(1998,10,4)
                );
        b1.toString();
        System.out.printf("Rok budowy: " + b1.ileLat() );

    }
}