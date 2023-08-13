package Gun34._02_Soru;

public class IlkOgrencisi extends  Ogrenci {
private String klup;
 int sayacID=1;
    public IlkOgrencisi(String isim,String klup) {
        super(isim,OgrTip.İLK);
        setKlup(klup);
        setId(sayacID++);

    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return super.toString()+",klup="+this.klup;
    }
}
