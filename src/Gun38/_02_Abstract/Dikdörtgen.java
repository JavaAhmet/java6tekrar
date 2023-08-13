package Gun38._02_Abstract;

public class Dikdörtgen extends Sekil{
   private double kisakenar;
   private double uzunKenar;

    public Dikdörtgen(double kisakenar, double uzunKenar) {
        setKisakenar(kisakenar);
        setUzunKenar(uzunKenar);
    }


    @Override
    double alan() {
        return this.uzunKenar*this.kisakenar;
    }

    @Override
    double cevre() {
        return (this.uzunKenar+this.kisakenar)*2;
    }

    public double getKisakenar() {
        return kisakenar;
    }

    public void setKisakenar(double kisakenar) {
        this.kisakenar = kisakenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }


}
