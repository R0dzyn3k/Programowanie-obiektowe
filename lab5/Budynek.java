import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    //Stwórz klasę przechowującą informacje o Budynku (nazwa, rok budowy, liczba pięter). Przygotuj
    //metodę wyświetlającą wszystkie informacje o budynku, oraz metodę obliczającą ile lat ma budynek
    //(rok obecny możesz ustawić na sztywno). Stwórz kilka obiektów (budynków), ustaw im wartości i
    //wywołaj dla nich metody. Do obliczenia daty należy użyć klasy LocalData.

    String nazwa;
    int liczbaPieter;
    LocalDate rokBudowy;

    public Budynek() {
    }

    @Override
    public String toString() {
        return "Budynek{" +
                "nazwa='" + nazwa + '\'' +
                ", liczbaPieter=" + liczbaPieter +
                ", rokBudowy=" + rokBudowy +
                '}';
    }

    public Budynek(String nazwa, int liczbaPieter, LocalDate rokBudowy) {
        this.nazwa = nazwa;
        this.liczbaPieter = liczbaPieter;
        this.rokBudowy = rokBudowy;
    }

    public long ileLat(){
        LocalDate today = LocalDate.now();
        return ChronoUnit.YEARS.between(rokBudowy,today);
    }
}
