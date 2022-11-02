import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Napisz metodę określania oraz rozwiązywania równania kwadratowego ax2+bx+c=0 , gdzie a, b i
        //c są dowolnymi stałymi podawanymi przez użytkownika
        System.out.println("Podaj a,b oraz c: ");
        int a = getInt();
        int b = getInt();
        int c = getInt();
        delta(a,b,c);

        //Napisz metody wyznaczania wartości funkcji określonych wzorami dla argumentów rzeczywistych
        //podawanych przez użytkownika:
        //
        //     { 2x  dla   x > 0
        // a(x){ 0   dla   x = 0
        //     {-3x  dla   x < 0
        //
        //     { x^2  dla  x >=1
        // b(x){ x    dla  x < 1
        //
        //     { 2+x  dla  x > 2
        // c(x){  8   dla  x = 2
        //     { x-4  dla  x < 2
        //
        System.out.println("Podaj d: ");
        int d = getInt();
        func(d);

        //Napisz metodę porządkowania trzech liczb x, y i z. Od najmniejszej do największej.
        System.out.println("Podaj 3 liczby: ");
        int[] tab = new int[3];
        for (int i = 0 ; i < 3 ; i++ ) {
            tab[i] = getInt();
        }
        fastbubleSort(tab);

        //Z wykorzystaniem operatorów logicznych ! (negacja), && (and) napisz metodę, który w zależności
        //od spełnienia pewnych warunków wyświetla odpowiednie komunikaty:
        //• Jeśli pada deszcz i jest autobus na przystanku, to „Weź parasol”, „Dostaniesz się na uczelnie”;
        //• Jeśli pada deszcz i nie ma autobusu, to „Nie dostaniesz się na uczelnię”;
        //• Jeśli nie pada deszcz i jest autobus na przystanku, to „Dostaniesz się na uczelnie”, „Miłego dnia
        //i pięknej pogody”
        System.out.println("Pada deszcz?\nJesli tak nacisnij 1, w przeciwnym wypadku nacisnij 0");
        int chose1 = getInt();
        System.out.println("Jest autobus na przystank?\nJesli tak nacisnij 1, w przeciwnym wypadku nacisnij 0");
        int chose2 = getInt();

        if( ( chose1 == 0 || chose1 == 1 ) && ( chose2 == 1 || chose2 == 0)){
            boolean rain,bus;
            rain = chose1 == 1;
            bus = chose2 == 1;
            weatherInfo( rain, bus );
        }

        //Z wykorzystaniem operatorów logicznych ! (negacja), || (or) napisz metodę, który w zależności od
        //spełnienia pewnych warunków wyświetla odpowiednie komunikaty:
        //• Jeśli nie ma zniżki na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”, „Zniżki
        //na samochód nie ma”;
        //• Jeśli nie ma zniżki na samochód lub nie otrzymałeś premii, to „Zakup samochód trzeba odłożyć
        //na później...”, „Zniżki na samochód nie ma”;
        //• Jeśli jest zniżka na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”.
        System.out.println("Jest znizka  na samochod?\nJesli tak nacisnij 1, w przeciwnym wypadku nacisnij 0");
        int chose3 = getInt();
        System.out.println("Dostales premie?\nJesli tak nacisnij 1, w przeciwnym wypadku nacisnij 0");
        int chose4 = getInt();

        if( ( chose3 == 0 || chose3 == 1 ) && ( chose4 == 1 || chose4 == 0)){
            boolean sale,bonus;
            sale = chose3 == 1;
            bonus = chose4 == 1;
            carSale( sale, bonus );
        }

        System.out.println("Wybierz co chcesz robic!\n1.Dodawac\n2.Odejmowac\n3.Mnozyc\n4.Obliczyc reszte z dzielenia");
        int chose5 = getInt();
        System.out.println("podaj e");
        int e = getInt();
        System.out.println("podaj f");
        int f = getInt();
        simplyCalculator( chose5, e, f );

    }
    public static void func( int x ){
        if( x > 0 ){
            System.out.println("Dla funkcji a( " + x + " ) = " + ( 2 * x ));
        } else if ( x == 0 ) {
            System.out.println("Dla funkcji a( " + x + " ) = 0");
        } else {
            System.out.println("Dla funkcji a( " + x + " ) = " + ( -3 * x ));
        }

        if ( x>= 1 ){
            System.out.println("Dla funkcji b( " + x + " ) = " + (x*x));
        } else {
            System.out.println("Dla funkcji b( " + x + " ) = " + x);
        }

        if( x > 2 ){
            System.out.println("Dla funkcji c( " + x + " ) = " + ( 2 + x ));
        } else if ( x == 2)
        {
            System.out.println("Dla funkcji c( " + x + " ) = 8");
        } else{
            System.out.println("Dla funkcji c( " + x + " ) = " + ( x - 4 ));
        }

    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static void delta(int a, int b, int c){
        if (a == 0){
            System.out.println("a nie moze byc rowne 0");
            return;
        }
        double delta = b * b - 4 * a * c;
        if ( delta == 0){
            double x = (-1 * (double)b)/(2 * (double)a);
            System.out.println("rownanie ma jedno rozwiazanie rzeczywiste : " + x);
        } else if ( delta > 0 ) {
            double delatSqrt = Math.sqrt(delta);
            double x1 = (-b - delatSqrt) / (2 * a);
            double x2 = (-b + delatSqrt) / (2 * a);
            System.out.println("rownanie ma dwa rozwiazania rzeczywiste: " + x1 + ", " + x2);
        } else {
            System.out.println("rownanie nie ma rozwiazan");
        }
    }
    public static void fastbubleSort( int[] tab ){
        int pom;
        int size = 3;
        for (int i = 0; i < size; i++){
            for ( int j = 0; j < size - 1; j++){
                if( tab[j] > tab[j+1] ){
                    pom = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = pom;
                }
            }
        }

        for (int element:tab) {
            System.out.print(element + ", ");
        }
    }
    public static void weatherInfo( boolean rain, boolean bus ){
        if( rain && bus ) System.out.println("wez parasol, dostaniesz sie na uczelnie");
        else if ( rain ) System.out.println("nie dostaniesz sie na uczelnie");
        else if ( bus) System.out.println("dostaniesz sie na uczelnie, milego dnia i pieknej pogody");
    }

    public static void carSale ( boolean onSale,  boolean bonus) {
        if ( !onSale || bonus ) System.out.println( "Mozesz kupic samochod!, Znizki na samochod nie ma" );
        if ( !onSale || !bonus ) System.out.println( "Zakup samochodu trzeba odlozyc na pozniej..., Znizki na samochod nie ma" );
        if ( onSale ||  bonus ) System.out.println( "Mozesz kupic samochod" );
    }

    public static int simplyCalculator ( int chose,  int a, int b ){

        switch ( chose ) {
            case 1 -> {
                System.out.println("Wynikiem dodawania liczby " + a + " + " + b + " = " + (a + b));
                return a + b;
            }
            case 2 -> {
                System.out.println("Wynikiem odejmowania liczby " + a + " - " + b + " = " + (a - b));
                return a - b;
            }
            case 3 -> {
                System.out.println("Wynikiem iloczynu liczb " + a + " * " + b + " = " + (a * b));
                return a * b;
            }
            case 4 -> {
                System.out.println("Reszta z dzielenia liczb " + a + " / " + b + " = " + (a % b));
                return a % b;
            }
        }

        return 0;
    }

}
