package Gun14;

import java.util.Scanner;

public class _03_DoWhile_01 {
    public static void main(String[] args) {
            // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
            // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
            Scanner read=new Scanner(System.in);
            String girilen;
            do {
               System.out.print("ifade giriniz");
               girilen=read.next();
              if (!girilen.equalsIgnoreCase("x"))
               System.out.println("program çaşıyor");
           }    while (!girilen.equalsIgnoreCase("x"));

            System.out.println("program bitti");

            }






}
