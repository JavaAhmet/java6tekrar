package Gun09;

import java.util.Scanner;

public class _02JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayı negatif mi, pozitif mi old. yaz
        // Sıfır ise sıfır yaz.

        Scanner oku= new Scanner(System.in);
        System.out.println("Sayı=");
        int sayi= oku.nextInt();

             if (sayi>0)
             {
             System.out.println("pozitif");
             System.out.println("if değeri kullanıldı");
             }
             if (sayi<0)
             {
            System.out.println("negatif");
            System.out.println("if değeri kullanıldı");
             }
             if (sayi==0)
                 {
                 System.out.println("sıfır ");
                 System.out.println("if değeri kullanıldı");
                 }









    }






}
