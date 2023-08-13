package Gun29.Soru;

public class Banka {
    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.MusteriNo=1;
        mus1.ad="Zeynep";
        mus1.Soyad="Baglar";

        System.out.println("mus1.MusteriNo = " + mus1.MusteriNo);
        System.out.println("mus1.ad = " + mus1.ad);
        System.out.println("mus1.Soyad = " + mus1.Soyad);

        mus1.MusteriHesap.paraYatir(100);
        mus1.MusteriHesap.paraYatir(200);
        mus1.MusteriHesap.paraCek(80);
        System.out.println("mus1.MusteriHesap = " + mus1.MusteriHesap);
    }
}

