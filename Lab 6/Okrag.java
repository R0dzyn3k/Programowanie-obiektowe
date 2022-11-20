public class Okrag {
    public Punkt srodek;
    public double promien;

    public Okrag() {
        srodek.x = 0;
        srodek.y = 0;
        promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }
    public double getPow(){
        return Math.PI*Math.pow(promien,2);
    }
    public void setPromien(double promien){
        this.promien = promien;
    }
    public double getPromien(){
        return promien;
    }
    public void wSrodku(Punkt p){
        double lewaStrona = Math.pow((srodek.x-p.x),2)+Math.pow((srodek.y-p.y),2);
        double prawaStrona = Math.pow(promien,2);

        if(lewaStrona<=prawaStrona)
            System.out.println("pkt.["+p.x+" , "+p.y+"] znajduje sie wewnatrz okregu");
        else System.out.println("Punkt lezy poza okregiem");
    }
}
