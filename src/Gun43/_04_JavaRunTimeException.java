package Gun43;

import java.util.Scanner;

public class _04_JavaRunTimeException {
    public static void main(String[] args) {

      boolean dogruClisti=true;
       do {
        try { //hata bölgesine şerit çektik kontrol etmek için
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Sayı giriniz=");
            int sayi1 = scanner.nextInt();
            System.out.println("2. Sayı giriniz=");
            int sayi2 = scanner.nextInt();

            int topla = sayi1 + sayi2;
            int bolum = sayi1 / sayi2;
            System.out.println("topla = " + topla);
            System.out.println("bolum = " + bolum);
            dogruClisti=true;
        }
        catch(Exception hata) // hata olursa yakala ve aşağıdaki bölümü çalıştır
        { // hata mesajlarını Exception cinsinden hata isimli değişkene attık
            System.out.println("Hata oluştu");
            System.out.println("hata = " + hata.getMessage());
            System.out.println("Lütfen 2. sayıya 0 vermeyiniz");
            dogruClisti = false;
        }
        }while (!dogruClisti); // doğru çalışmadıysa sürekli dön

    }
}
