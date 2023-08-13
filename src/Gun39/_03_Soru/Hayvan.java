package Gun39._03_Soru;

public abstract class Hayvan {
        private final int id; // final değişkenleri constructorda atanır
        private String isim;
        private boolean vahsi;
        private String dogumTarihi;

        abstract void yiyecegi();
        abstract void yemekMiktari();
        abstract void gunlukUykuSuresi();
        abstract void sesi();

        // nesnelerden bağımsız sayaç olmalı derken static olmalı
    private static int sayacID=1; // YOKSA HER ZAMAN 1 DEN BAŞLAR BAĞIMSIZ OLMAZSSA

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
       // this.id = id1;
        setIsim(isim);
        setVahsi(vahsi);
       setDogumTarihi(dogumTarihi);
       this.id=sayacID++;

    }

    public int getId() {
        return id;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.println("ismi="+this.isim);
        System.out.print("yiyeceği="); yiyecegi();
        System.out.print("yemek mik="); yemekMiktari();
        System.out.print("uyku süresi="); gunlukUykuSuresi();
        System.out.print("sesi="); sesi();

        return
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' ;

    }
}
