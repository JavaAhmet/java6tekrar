package Gun14;

import java.util.Scanner;

public class _02_DoWhile {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
      int toplam=0;
      int sayi=0;
     do { //bu döngü en az bir kere çalışır
         System.out.println("sayi giriniz");
         sayi = read.nextInt();
         toplam=toplam+sayi;
       } while (sayi!=0); // şart kontrolü sonda

        System.out.println("toplam = " + toplam);

    }

}
