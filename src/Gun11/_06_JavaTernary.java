package Gun11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

       // ? böyle ise, : else
        Scanner read=new Scanner(System.in);
        System.out.println("please write number=");
        int number= read.nextInt();
        System.out.println(number==0 ?" Zero": number>0 ? "pozitive":"Negative");


    }
}
