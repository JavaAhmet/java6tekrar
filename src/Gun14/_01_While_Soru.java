package Gun14;

import java.util.Scanner;

public class _01_While_Soru {
    public static void main(String[] args) {
        // kullanıcı 0 değeri girene kadar
       // girdiği sayıların toplamını bulunuz
        Scanner read=new Scanner(System.in);
       int toplam=0;

        System.out.println("sayi giriniz");
        int sayi = read.nextInt();
        toplam=toplam+sayi;

        while (sayi!=0) // döngünün dönme şartı girilen sayının sıfırdan farklı olması
        {

            System.out.println("sayi giriniz");
            sayi = read.nextInt();
            toplam=toplam+sayi;
        }

        System.out.println("toplam = " + toplam);






    }
}
