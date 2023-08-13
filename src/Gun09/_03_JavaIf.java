package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // girilen iki sayıdan büyük olanın değerini ekrana yazınız.
        // eşit ise eşit yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.println("Sayı1=");
        int sayi1= oku.nextInt();
        System.out.println("Sayı2");
        int sayi2= oku.nextInt();

        { if (sayi1>sayi2)

            //System.out.println(" int sayi1");
            System.out.println("Sayı 1 büyük "+sayi1);
        }
        if (sayi1<sayi2) {
           // System.out.println("int sayi2");
            System.out.println("Sayı 2 büyük "+sayi2);
        }

        if (sayi1==sayi2)
        {
            System.out.println("sayılar eşit");
        }



    }
}
