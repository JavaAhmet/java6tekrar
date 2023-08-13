package Gun12;

import java.util.Scanner;

public class _04_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.
        Scanner read=new Scanner(System.in);
        Scanner readStr=new Scanner(System.in);
        System.out.println("please entry number=");
        int no1= read.nextInt();
        System.out.println("please entry number2=");
        int no2= read.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.println("Seçiminiz=");
        String secim=readStr.next();
        // merdivenli if ,ladder if
        if (secim.equalsIgnoreCase("T")) //T,Ç,P,B
            System.out.println("toplam="+(no1+no2));
        else
            if (secim.equalsIgnoreCase("Ç"))
        System.out.println("çıkarma= " + (no1-no2));

        else
            if (secim.equalsIgnoreCase("P"))
                System.out.println("çarpma="+ (no1*no2));
            else
                if (secim.equalsIgnoreCase("b"))
        System.out.println("bolme="+(no1/ (double)no2));
        else
                    System.out.println("hatalı giriş");

















    }
}
