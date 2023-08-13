package Gun30._04_Soru;

import java.util.Scanner;

public class SoruMain {
    public static void main(String[] args) {
        //static demeseydik  Sabitler sinifinde
        //Sabitler sb=new Sabitler();
        //sb.birGundekiSaatSayisi  -> şeklinde nesne oluşturacaktık
// önce değişkenleri tanımlayalım aşağıda.
int gun =0;
int saat= 0;
int dak=0;
// klavyeden okunacak
        Scanner scanner=new Scanner(System.in);
        System.out.print("Gun=");gun= scanner.nextInt();
        System.out.print("Saat=");saat= scanner.nextInt();
        System.out.print("Dakika=");dak= scanner.nextInt();

        // şimdi toplam saniyeyi bulalım
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
        System.out.println("toplamSaniye = " + toplamSaniye);

       //2. yöntem
        System.out.println("toplamSaniye = " +
                Sabitler.hesapla(gun,saat,dak));








    }

}