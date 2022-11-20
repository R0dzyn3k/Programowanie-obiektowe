public class Prostokat {

    //Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość. Klasa powinna
    //posiadać metody obliczające pole, obwód i długość przekątnej. Utwórz klasę Main oraz obiekty
    //klasy prostokąt oraz zaprezentuj działanie klasy Prostokąt.

    double dlugosc;
    double szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double pole (){
        return this.dlugosc * this.szerokosc;
    }

    public double obw (){
        return 2*(this.dlugosc + this.szerokosc);
    }

    public double przekatna (){
        return Math.sqrt((dlugosc*dlugosc)+(szerokosc*szerokosc));
    }
}
