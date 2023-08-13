package Gun30._04_Soru;

public class Sabitler {
 final static int BirGundekiSaatSayisi=24;
 final static int BirSaattekiDakikaSayisi=60;
 final static int BirDakikaSaniyeSayisi=60;

 // aşağıda bir fonksiyonla saniye toplamı hesaplanabilir di

    public static int hesapla(int gun,int saat,int dak){
       int toplamSaniye=
       gun
               * Sabitler.BirGundekiSaatSayisi
               *Sabitler.BirSaattekiDakikaSayisi
               *Sabitler.BirDakikaSaniyeSayisi
               +
               saat
                       *Sabitler.BirSaattekiDakikaSayisi
                       *Sabitler.BirDakikaSaniyeSayisi
               +dak
               *Sabitler.BirDakikaSaniyeSayisi;



        return toplamSaniye;
    }

}
