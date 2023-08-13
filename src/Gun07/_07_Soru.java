package Gun07;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        // Tek seferde girilen bir ad soyadın (tam ad) adının ve soyadını ayırıp ,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad).

        Scanner oku= new Scanner(System.in);
        String adSoyad=oku.nextLine();
        int uzunluk= adSoyad.length();


        int boslukindex= adSoyad.indexOf(" ");
        String ad =adSoyad.substring(0,boslukindex);
        String soyad=adSoyad.substring(boslukindex+1,uzunluk);
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
       //*                     */
        // 0 - boşluğun indexine kadar desem :adı
        // boşluğun indexi+1 den sonuna kadar desem: soyadı verir

       // int boslukIndex= adSoyad.indexOf(" ");
       // String ad= adSoyad.substring(0, boslukIndex);
       // String soyad= adSoyad.substring(boslukIndex+1);
       // System.out.println("ad = " + ad); //ahmet
        // System.out.println("soyad = " + soyad);// tefek






    }
}
