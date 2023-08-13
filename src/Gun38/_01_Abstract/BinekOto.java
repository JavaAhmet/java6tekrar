package Gun38._01_Abstract;

public abstract class BinekOto {// parent class
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    abstract int hizlanmaSuresi();

    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        setMarka(marka);
       setUretimYili(uretimYili);
        setVitesAdedi(vitesAdedi);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
