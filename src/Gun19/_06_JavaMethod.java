package Gun19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // bir sayının tek mi çift mi olduğunu yazdırınız.


        tekmiCiftmi(55);
        tekmiCiftmi(60);
        /***************************************/

        okutekmiciftmi();

    }






    public static void tekmiCiftmi(int sayi){
       if (sayi%2!=0)
           System.out.println("m:tek");
       else
           System.out.println("m:çift");
    }
    public static void okutekmiciftmi(){
        Scanner read=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi= read.nextInt();

        tekmiCiftmi(sayi);
       // if (sayi%2==0)
        //    System.out.println("m:çift");

        //else
         //   System.out.println("m:tek");

    }


}
