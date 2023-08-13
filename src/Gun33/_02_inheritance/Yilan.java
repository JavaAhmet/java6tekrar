package Gun33._02_inheritance;

public class Yilan extends Hayvan{
    private int uzunluk;
    public Yilan(String renk, int kilo, String cinsi, int uzunluk) {
        super(renk, kilo, cinsi);
                setUzunluk(uzunluk);
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("tısladı");
    }

    @Override
    public String toString() {
        return super.toString()+",uzunluk"+this.uzunluk;
        //return super.getCinsi()+" "this.uzunluk;
    }

    public int getUzunluk(){
        return uzunluk;
    }
}
