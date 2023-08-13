package Gun16;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        int[] scors = new int[5];// 50 tane int kutusu oluşturuldu
        Scanner scanner=new Scanner(System.in);
        int total=0;
        int pass=0;
        for (int i = 0; i < scors.length; i++) {
            System.out.print("entry scors=");
            scors[i]=scanner.nextInt();
            total=total+scors[i];
        }
       double ort=(double) total/ scors.length;
        for (int i = 0; i < scors.length ; i++) {
            if (scors[i]>ort) {
                System.out.println("pass scors="+scors[i]);
                pass++;
            }
        }
        System.out.println("ort = " + ort);
        System.out.println("pass = " + pass);
    }
}
