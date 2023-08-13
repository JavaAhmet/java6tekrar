package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.
        Scanner read=new Scanner(System.in);
        Scanner read1=new Scanner(System.in);
        System.out.println("sayı1=");
        int sayi1= read.nextInt();
        System.out.println("sayı2=");
        int sayi2= read.nextInt();


        System.out.println("topla T");
        System.out.println("çıkar Ç");
        System.out.println("ÇARP P");
        System.out.println("BÖL B");
        System.out.println("elect=");
        String select= read1.nextLine(); // T,Ç,P,B

        switch (select.toUpperCase()){  //sadece 1 eşitlik durumu için çalışır
            case "T": System.out.println("topla="+(sayi1+sayi2)); break;
            case "C":System.out.println("çıkar="+(sayi1-sayi2)); break;
            case "P":System.out.println("çarp="+(sayi1*sayi2)); break;
            case "B":System.out.println("böl="+(sayi1/(double)sayi2)); break;
            default:System.out.println("hatalı değer");


        }



    }
}
