package Gun33._03_Soru;

public class calisan {
    private String isim;
    private double tabanMaas;
    private double maasKatSayisi;

    public calisan(String isim, double tabanMaas, double maasKatSayisi) {
        setIsim(isim);
        setTabanMaas(tabanMaas);
        setMaasKatSayisi(maasKatSayisi);

    }

    public double maasHesapla()
    {
        return this.tabanMaas*this.maasKatSayisi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getTabanMaas() {
        return tabanMaas;
    }

    public void setTabanMaas(double tabanMaas) {
        this.tabanMaas = tabanMaas;
    }

    public double getMaasKatSayisi() {
        return maasKatSayisi;
    }

    public void setMaasKatSayisi(double maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Bordro" +
                "\nisim='" + this.isim  +
                "\ntabanMaas=" + this.tabanMaas +
                "\nmaasKatSayisi=" + this.maasKatSayisi+
                "\n Ödenecek Maaş" +maasHesapla()
                ;
    }
}
