package Gun32._03_Soru;

import java.util.Scanner;

public class okulMain {
    public static void main(String[] args) {
        Scanner scannerInt=new Scanner(System.in);
        Scanner scannerStr=new Scanner(System.in);
        Okul yeniOkul=new Okul("Kabataş okulu",3);
        do {
            System.out.print("Öğrenci Adı=");String ad=scannerStr.nextLine();
            System.out.print("Öğrenci Soyadı=");String soyad=scannerStr.nextLine();
            System.out.print("Öğrenci Yaşı="); int yas = scannerInt.nextInt();
            
            if (yas<15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                yeniOkul.getOgrencileri().add(ogr);
            }
            else {
                System.out.println("öğrenci yaşı bu okul için uygun değil");
            }
            
        }while (yeniOkul.getOgrencileri().size()< yeniOkul.getKontenjan());

        System.out.println("yeniOkul.getOgrencileri() = " + yeniOkul.getOgrencileri());
    }
}
