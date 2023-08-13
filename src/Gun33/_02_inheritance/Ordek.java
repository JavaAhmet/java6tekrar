package Gun33._02_inheritance;

public class Ordek extends Hayvan {
    private double kanatAcikligi;


    public double getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(double kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }

    public Ordek(String renk, int kilo, String cinsi, double kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vak vak");
    }

    @Override
    public String toString() {
        return super.toString()+",kanatAcikligi="+this.kanatAcikligi;
    }
}
