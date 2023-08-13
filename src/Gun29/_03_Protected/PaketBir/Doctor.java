package Gun29._03_Protected.PaketBir;

public class Doctor {
    public String hastaneAd;// public: diğer paketlerden erişim izni verildi
    String adi;             // default
    protected String bolumu; // default aynı
    private String SicilNo; // private  sadece class ın içinden erişilebilir


     Doctor() { // sadece kendi paketindekiler erişebilir çünkü default
    }

    public Doctor(String adi) { // diğer tüm paketlerden erişim olur çünkü public

         this.adi = adi;
    }
}
