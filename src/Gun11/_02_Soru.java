package Gun11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner read= new Scanner(System.in);
        System.out.println("hour=");
        int hour= read.nextInt();



            if (hour<=3)
                System.out.println("10tl");
             else  // hour>3                                                    // if (hour > 0 && hour <=3)
            {                                                                 //    System.out.println("10tl");
                                                                             // if (hour > 3 && hour <=5)
                if (hour <= 5)                                                 //    System.out.println("15tl");
                    System.out.println("15tl");                                   // if (hour>5)
                else                                                              //  System.out.println("20tl");
                    System.out.println("20tl");
            }
    }


}
