import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Napisz metodę, która zwróci twoje imię oraz aktualny wiek.
        System.out.println(getImie());
        System.out.println(getWiek());
        //Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn.
        //Argumenty przekazywane do metody są liczbami wprowadzanymi przez użytkownika z klawiatury.
        System.out.println("Podaj a: ");
        double a = getDouble();
        System.out.println("Podaj b: ");
        double b = getDouble();
        obliczenia(a,b);
        //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta.
        System.out.println("Podaj c: ");
        int c = getInt();
        isEvenNum(c);
        //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez
        //3 i przez 5.
        isEvenNum2(c);
        //Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi.
        System.out.println("Podaj d: ");
        int d = getInt();
        System.out.println(intX3(d));
        //Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy.
        System.out.println("Podaj e: ");
        double e = getDouble();
        System.out.println(Math.sqrt(e));
        //Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli
        //z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
        //Argumenty przekazywane do metody są liczbami losowymi z przedziału <a,b> a i b wczytywane są
        //przez użytkownika z klawiatury

        System.out.println("Podaj 2 liczby: ");
        int f = getInt();
        int g = getInt();
        int[] tab = getRandomInt(f,g);
        System.out.print("Twoje wylosowane liczby to: ");
        for (int element:tab) {
            System.out.print(element+", ");
        }
        System.out.println("\n");
        pitagoras(tab[0],tab[1],tab[2]);
    }
    private static double getDouble(){
        return new Scanner(System.in).nextDouble();
    }
    public static String getImie(){
        return "Bartosz";
    }
    public static int getWiek(){
        return 25;
    }
    public static void obliczenia(double a, double b){
        System.out.println("Suma a + b = " + (a+b));
        System.out.println("Roznica a - b = "+(a-b));
        System.out.println("Iloczyn a*b = "+(a*b));
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static boolean isEvenNum( int a ){
        if(a%2==0){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
    public static boolean isEvenNum2( int a ){
        if(a%3 == 0 ||a%5 == 0){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
    public static int intX3(int a){
        return (a*a*a);
    }
    public static boolean pitagoras(double a, double b, double c){
        if (a > b && a > c){
            if ((c*c)+(b*b)==(a*a)){
                System.out.printf("true");
                return true;
            }
            else{
                System.out.printf("false");
                return false;
            }
        } else if (b > a && b > c) {
            if ((a*a)+(c*c)==(b*b)) {
                System.out.printf("true");
                return true;
            }
            else{
                System.out.printf("false");
                return false;
            }
        }else if (c > a && c > b) {
            if ((a*a)+(b*b)==(c*c)) {
                System.out.printf("true");
                return true;
            }
            else{
                System.out.printf("false");
                return false;
            }
        }
        System.out.printf("false");
        return false;
    }
    public static int[] getRandomInt(int a, int b){
        if (a > b){
            int pom = b;
            b = a;
            a = pom;
        }
        Random rand = new Random();
        int[] tab = new int[3];
        for (int i = 0; i < 3; i++) {
            tab[i] = rand.nextInt(a,(b+1));
        }
        return tab;
    }
}