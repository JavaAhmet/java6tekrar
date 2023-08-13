package Gun20;

import java.awt.*;
import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.
        Scanner scanner=new Scanner(System.in);

        System.out.println("1. sayı gir=");
        int sayi1= scanner.nextInt();
        System.out.println("2. sayı gir=");
        int sayi2= scanner.nextInt();


        int enb= enbBul(sayi1,sayi2);
        System.out.println("enb = " + enb);
    }

        public static int enbBul(int s1,int s2){return (s1>s2 ? s1:s2);
        }


}
