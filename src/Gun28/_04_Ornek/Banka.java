package Gun28._04_Ornek;

public class Banka {
    String ad;
    int kurulusYili;
    int SubeSayisi;

    public Banka() {
    }

    public Banka(String ad, int subeSayisi, int kurulusYili)
    {
        this.ad = ad;
        this.kurulusYili = kurulusYili;
        this.SubeSayisi = subeSayisi;

    }

    public Banka(String ad, int kurulusYili)
    {
       this(ad,kurulusYili,0);
    }

    public Banka(String ad)
    {
        this(ad,0,0);
    }

    @Override
    public String toString() {
        return "Banka{" +
                "ad='" + ad + '\'' +
                ",+kurulusYili=" + kurulusYili+
                ",  + SubeSayisi=" + SubeSayisi+ '}';
    }
}
