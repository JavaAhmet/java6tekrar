package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan Adını ve soyadını okutup ayrı ayrı ekrana yazdırın

        Scanner oku = new Scanner(System.in);
        System.out.println("Adınızı giriniz=");
        String ad = oku.nextLine();
        System.out.println("Soyadınızı giriniz");
        String soyad= oku.nextLine();
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("Adınız ve soyadınız="+ad+" "+soyad);



    }
}
