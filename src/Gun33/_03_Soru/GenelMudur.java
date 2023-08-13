package Gun33._03_Soru;

public class GenelMudur extends calisan {

   private double tazminat;
    public GenelMudur(String isim, double tabanMaas, double maasKatSayisi,double tazminat) {
        super(isim, tabanMaas, maasKatSayisi);
        setTazminat(tazminat);
    }


    @Override
    public double maasHesapla() {
        return super.maasHesapla()+this.tazminat;
    }

    @Override
    public String toString() {
        return super.toString()+",tazminat="+this.tazminat;
    }

    public double getTazminat()
    {
        return tazminat;
    }

    public void setTazminat(double tazminat)
    {
        // eğer kademesi bu ise tazminatın yarısını alır
        this.tazminat = tazminat;
    }
}
