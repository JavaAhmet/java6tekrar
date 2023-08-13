package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı=");
        int sayi = oku.nextInt();

       int bölme=(sayi/2);
       int kalan1=1;
       int kalan2=0;

       if (kalan1==1)
           System.out.println("tek");

        if(kalan2==2)

           System.out.println("çift");

        // eğer sayı 2 ye bölümünden kalan var ise tektir
        //if (sayi%2==1)
           // System.out.println("tek");
        //if (sayi%2==0)
           // System.out.println("çift");




    }
}
