import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Napisz program obliczający sumę i średnią elementów tablicy z użyciem pętli for oraz for each.
        //Elementy do tablicy mają zostać wylosowane z dowolnego przedziały. Należy zaproponować
        //oddzielną metodę do losowania liczb.
        zad1();

        //Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic. Pierwsza
        //tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.
        int[] tab1 = { 1, 3, 5, 7, 2 ,3, 8, 4, 10, 11, 56, 44 };
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
        zad4();

        //Napisz program, który pobierze od użytkownika osiem liczb, zapisze je w tablicy, a następnie
        //posortuje tą tablicę rosnąco i wypisze wynik sortowania na ekran. Dla przykładu, dla liczb 10,
        //-2, 1, 100, 20, -15, 0, 10, program wypisze -15, -2, 0, 1, 10, 10, 20, 100. Zastanów się, jak można
        //posortować ciąg liczb i spróbuj zaimplementować swoje rozwiązanie. Przetestuj je na różnych
        //zestawach danych. Możesz też skorzystać z jednego z popularnych algorytmów sortowania, np.
        //sortowania przez wstawianie. Działanie algorytmu omówiono szczegółowo na zajęciach
        //algorytmy i struktury danych.
        zad5();

        //Napisz program, który pobierze od użytkownika pięć liczb, zapisze je w tablicy, a następnie
        //policzy i wypisze silnię każdej z pobranych liczb.
        System.out.print("\n");
        zad6();

        //Napisz program, w którym zdefiniujesz dwie tablice przechowujące wartości typu String.
        //Zainicjalizuj obie tablice takimi samymi wartościami, w takiej samej kolejności. Napisz kod,
        //który porówna obie tablice i odpowie na pytanie, czy są one takie same.
        zad7();

    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }

    public static String getString(){
        return new Scanner(System.in).nextLine();
    }
    public static int[] fillIn( int a, int b, int count ){

        if ( a > b ){
            int pom = a;
            a = b;
            b = pom;
        }

        int[] tab = new int[ count ];
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            tab[ i ] = rand.nextInt( a, b );
        }
        return tab;
    }


    public static void zad1 (){
        System.out.print("Podaj przedzial liczbowy ");
        int a = getInt(), b = getInt();
        int[] tab = fillIn( a, b, 10 );
        zad1For( tab );
        System.out.print("\n");
        zad1Foreach( tab );
        System.out.print("\n");
    }
    public static void zad1For(int[] tab ){

        int sum = 0;

        for ( int i = 0; i < tab.length; i++ ){
            sum += tab[i];
        }
        System.out.printf( "Suma wynosi: " + sum + " ,Srednia wynosi : " + ( (double)sum / tab.length ) );
    }

    public static void zad1Foreach( int[] tab ){

        int sum = 0;

        for (int element : tab ) {
            sum += element;
        }
        System.out.printf( "Suma wynosi: " + sum + " ,Srednia wynosi : " + ( (double)sum / tab.length ) );
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

    public static void zad4(){

        System.out.printf("Podaj 5 slow" );
        String[] tabString2 = new String[ 5 ];

        for ( int i = 0; i < 5; i++ ) {
            tabString2[ i ] = getString();
        }
        for ( int i = tabString2.length -1; i >= 0  ; i-- ) {
            System.out.print( reverse( tabString2[ i ] ) + " " );
        }
        System.out.println("\n");
    }

    public static String reverse ( String text ){

        String reverse = new String();
        for( int i = text.length(); i > 0 ; i-- ){
            reverse += text.charAt( i - 1 );
        }
        return reverse;
    }

    public static void zad5(){

        System.out.print("Podaj 8 liczb: ");
        int[] tab = new int[8];

        for (int i = 0; i < tab.length; i++) {

            tab[ i ] = getInt();
        }

        for (int element : bubbleSort(tab) ) System.out.print( element + " " );
    }

    public static int[] bubbleSort( int[] tab ){

        int pom;
        for ( int i = 0; i < tab.length; i++ ){

            for ( int j = 0; j < tab.length - 1; j++){

                if( tab[j] > tab[j+1] ){

                    pom = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = pom;
                }
            }
        }
        return tab;
    }

    public static void zad6(){

        System.out.print("Podaj 5 liczb: ");
        int[] tab = new int[5];

        for (int i = 0; i < tab.length; i++) {
            tab[ i ] = getInt();
        }
        for (int element : tab ) {
            System.out.println( factorial( element ) );
        }
    }

    public static double factorial( int x ){

        if( x < 1 ) {
            System.out.println( "podaj liczbe wieksza od 0!" );
            return -1;
        }

        double result = 1;

        for ( int i = 1; i <= x; i++ ) {
            result *= i;
        }
        return result;
    }

    public static void zad7(){

        boolean flag = true;
        String[] firstTab = { "Ala", "ma", "kota", "i", "psa" };
        String[] secondTab = { "Ala", "ma", "kota", "i", "psa" };

        if( firstTab.length != secondTab.length ) flag =  false;

        else {
            for (int i = 0; i < firstTab.length; i++) {
                if (!firstTab[i].equals(secondTab[i])) {
                    flag = false;
                    break;
                }
            }
        }

        if( flag ) System.out.println( "Tablice sa takie same" );
        else  System.out.println( "Tablice nie sa takie same" );
    }
}