import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Grupa laboratoryjna składa się z n studentów (wartość n podaje użytkownik). Wprowadzamy
        //liczbę punktów dla każdego studenta. Napisz program, który obliczy średnią liczbę punktów w
        //grupie z wykorzystaniem pętli while.
        System.out.println( "Wprowadz liczbe studentow: " );
        int n = getInt();
        System.out.println( "Srednia punktow w grupie wynosi: " + zad1( n ) );

        //Napisz program, który pozwoli na wczytanie 10 liczb i wyznaczeniu ilości oraz sumy liczb
        //ujemnych i dodatnich podanych przez użytkownika.
        System.out.println("Podaj 10 liczb: ");
        int[] numbers = getIntTable( 10 );
        zad2( numbers );

        //Dany jest ciąg n liczb (n>0), napisz program pozwalający na obliczenie sumy wszystkich liczb
        //parzystych w danym ciągu.
        System.out.println( "Wprowadz n: " );
        n = getInt();
        System.out.println("Suma liczb parzystych w ciagu wynosi: " + zad3( n ) );

        //Wykorzystując algorytm z zadania 3, napisz program który pozwoli użytkownikowi na
        //wylosowanie n liczb z przedziału (-10,45) i obliczy sumę wszystkich liczb parzystych w danym
        //ciągu.
        System.out.println( "Wprowadz n: " );
         n = getInt();
        zad4( n );
        System.out.println("Suma liczb parzystych w ciagu wynosi: " + zad4( n ) );

        //Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest
        //palindromem. Palindrom to słowo, które jest takie samo czytane od początku i od końca, np.
        //kajak
        System.out.println("Podaj wyraz: ");
        String text = getString();
        zad5(text);

    }

    public static int getInt () {
        return new Scanner( System.in ).nextInt();
    }
    public static String getString () {
        return new Scanner( System.in ).nextLine();
    }
    public static int[] getIntTable ( int count ) {
        int[] result = new int[ count ];
        for (int i = 0; i < count; i++) {
            result[ i ] = getInt();
        }
    return result;
    }
    public static float zad1( int n ) {

        float[] students = new float[ n ];
        float average = 0;
        Random random = new Random();

        for( int i = 0; i <  n; i++ ){
            students[ i ] = random.nextInt( 101 );
        }

        int i = n;
        while( i != 0 ){
            average += students[ i - 1 ];
            i--;
        }
        return average / n;
    }

    public static void zad2( int[] table ) {

    int positiveNumbersCount = 0, positiveNumbersSum = 0,  negativeNumbersCount = 0, negativeNumbersSum = 0;

        for ( int i : table ) {
            if ( i < 0 ) {
                negativeNumbersCount++;
                negativeNumbersSum += i;
            } else if ( i > 0 ) {
                positiveNumbersCount++;
                positiveNumbersSum += i;
            }
        }
        System.out.print("Liczba liczb dodatnich wynosi: " + positiveNumbersCount + ", Liczb ujemnych: " + negativeNumbersCount );
        if ( negativeNumbersCount + positiveNumbersCount != table.length ) System.out.print(" Liczba zer: " + ( table.length - ( negativeNumbersCount + positiveNumbersCount ) ) );
        System.out.println("\nSuma liczb dodatnich wynosi: " + positiveNumbersSum + ", Liczb ujemnych: " + negativeNumbersSum );
    }

    public static float f( int x ) {

        return ( x * (float) 3 ) / 2 ;
    }
    public static float zad3( int n ) {

        if (!(n > 0)) {
            System.out.println("Liczba n musi byc wieksza od 0");
            return 0;
        }

        float[] table = new float[n];

        for (int i = 0; i < n; i++) {
            table[i] = f(i);
            System.out.print(table[i] + " ");
        }
        return evenNumbersSum( table );
    }


    public static float evenNumbersSum ( float[] table ) {
        float sum = 0;

        for (float i : table ){
            if( i%2 == 0 ) sum += i;
        }

        return sum;
    }

    public static float zad4( int n ) {

        Random rand = new Random();
        float[] table = new float[ n ];

        for (int i = 0; i < n; i++) {
            table[ i ] = rand.nextInt( -10,46 );
            System.out.print(table[i] + " ");
        }
        return evenNumbersSum( table );
    }

    public static void zad5 ( String text ){
        String reverse = new String();
        text = text.toLowerCase();
        for( int i = text.length(); i > 0 ; i-- ){
            reverse += text.charAt( i - 1 );
        }

        if ( text.equals( reverse ) ) System.out.println( "Wyraz jest palindromem" );
        else System.out.println( "Wyraz nie jest palindromem" );
    }
}
