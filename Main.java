import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Napisz program obliczający sumę i średnią elementów tablicy z użyciem pętli for oraz for each.
        //Elementy do tablicy mają zostać wylosowane z dowolnego przedziały. Należy zaproponować
        //oddzielną metodę do losowania liczb.
        System.out.printf("Podaj przedzial liczbowy ");
        int a = getInt(), b = getInt();
        zad1For( fillIn( a, b, 10 ) );

        //Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic. Pierwsza
        //tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.
        int[] tab1 = { 1, 3, 5, 7, 2 ,3, 8, 4, 10, 11};
        int[] tab2 = { 1, 3, 5, 7, 2 ,3, 8, 4, 10 };
        System.out.print("\n");
        zad2( tab1 );
        System.out.print("\n");
        zad2( tab2 );
        System.out.print("\n");

        //Napisz program, w którym zdefiniujesz tablicę wartości typu String i zainicjalizujesz ją
        //przykładowymi wartościami. Skorzystaj z pętli for-each, aby wypisać wszystkie wartości
        //tablicy ze wszystkimi literami zamienionymi na wielkie. Skorzystaj z funkcjonalności
        //toUpperCase wartości typu String, którą poznaliśmy już w jednym z poprzednich rozdziałów.
        String[] tabString = { "Adam", "Janusz", "Kowalski", "Szeregowy" };
        zad3( tabString );

        //Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy. Następnie,
        //program powinien wypisać wszystkie słowa, od ostatniego do pierwszego, z literami
        //zapisanymi od końca do początku. Dla przykładu, dla podanych słów "Ala", "ma", "kota", "i",
        //"psa" program powinien wypisać: "asp", "i", "atok", "am", "alA"
        System.out.printf("Podaj 5 slow" );
        String[] tabString2 = new String;
        for ( int i = 0; i < 5; i++ ) tabString2[]
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }

    public static String getString(){
        return new Scanner(System.in).nextLine();
    }

    public static int[] fillIn( int a, int b, int count ){

        int[] tab = new int[ count ];
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            tab[ i ] = rand.nextInt( a, b );
        }
        return tab;
    }

    public static void zad1For(int[] tab ){

        int sum = 0;

        for ( int i = 0; i < tab.length; i++ ){
            sum += tab[i];
        }
        System.out.printf( "Suma wynosi: " + sum + " ,Srednia wynosi : " + ( sum / tab.length ) );
    }

    public static void zad1Foreach( int[] tab ){

        int sum = 0;

        for (int element : tab ) {
            sum += element;
        }

        double average = sum / tab.length;

        System.out.printf("Suma wynosi: " + sum + " ,Srednia wynosi : " + average );
    }

    public static void zad2( int[] tab ){

        for (int i = 0; i < tab.length; i++) {

            if ( i % 2 == 0 ) System.out.print(tab[ i ] + " " );

        }
    }

    public static void zad3 ( String tab[] ){
        for (String element : tab ) {
            System.out.printf( element.toUpperCase() + " " );
        }
    }
}