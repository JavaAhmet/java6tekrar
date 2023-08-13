package Gun30._02FinalVariables.Ornek2;

public class Vatandas {
    String isim;
    String Adres;
    final int tcNo; // dışardan erişim olmasın diye
    // final yaptık

  private static int Tcsayac=1; //TcNoSayac=1;
    // nesneye iit olması diye sayac dedik
    // ve dışardan erişim olmasın diye
    // private yaptık ve sınıf olsun her seferinde yazılmasın
    // diye static yaptık

    public Vatandas(String isim, String adres) {
        this.isim = isim;
        Adres = adres;
        this.tcNo =Tcsayac;

    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", Adres='" + Adres + '\'' +
                ", tcNo=" + tcNo +
                '}';
        // static atmadı to stringe cünkü kendisine ait nesne değil
        // sınıfolduğu için
    }
}
