package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini
        // ekrana yazdırınız. Ternary operatör ile yapınız.
        Scanner read=new Scanner(System.in);
        System.out.println("number=");
        int count= read.nextInt();
        //1th method
         int sonuc= (count>50) ? 1: 0;
        System.out.println("sonuc = " + sonuc);

        //2th method

        System.out.println((count>50)? 1:0);



    }
}
