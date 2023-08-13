package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.okulNo = 1001;
        ogr1.ad = "Hakan";
        ogr1.soyad = "Kılıç";
        //ogr1.okulad="Bayrak okulu";

        ogr1.mektep = new Okul();
        ogr1.mektep.mudurAd="ahmet ahmet";
        ogr1.mektep.okulAd="ahmet okulu";
        ogr1.mektep.adres="Ebu feyz elçibey";
        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr1.mektep.okulAd = " + ogr1.mektep.okulAd);


    }
}
