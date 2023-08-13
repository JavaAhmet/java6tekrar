package Gun14;

import java.util.Scanner;

public class _03_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        Scanner read=new Scanner(System.in);
        String girilen= read.next();




       while (!girilen.equalsIgnoreCase("x"))
       {

           System.out.println("program çaşıyor");
           System.out.print("ifade giriniz");
           girilen=read.next();
       }                                          //  while (!girilen.equalsIgnoreCase("x"))
           System.out.println("program bitti");
    }


}
