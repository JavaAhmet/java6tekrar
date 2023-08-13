package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //tipi  adı     başlangıç değeri
         int      sayı=5;

        Scanner     okuyucu=new Scanner(System.in);
        // tipi     adı     yeni bir tane okuyucu oluştur(klavyeden-kosoldan)

        System.out.println("Sayı giriniz=");
        int okunan=okuyucu.nextInt();//klavyeden girilen TAM SAYI yı oku
        // rakam girilip entere basıldığında değeri alıp okunan a atıyor.
        System.out.println("okunan =" + okunan);
        System.out.println("bitti");
    }
}
