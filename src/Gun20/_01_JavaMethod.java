package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        int eleman[]=new int [5];
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < eleman.length; i++) {
            System.out.print("sayı giriniz=");
            eleman[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString((eleman)));
        enBuyukYaz(eleman);
        enKücükYaz(eleman);
        ort(eleman);

    }
    public static void enBuyukYaz(int[]eleman){
        Arrays.sort(eleman);
        System.out.println("en büyük= " + eleman[eleman.length-1]);

    }
    public static void enKücükYaz(int[]eleman){
        Arrays.sort(eleman);
        System.out.println("en küçük = " + eleman[0]);

    }

    public  static void  ort(int[]eleman){
        double total=0;
        for (int i = 0; i < eleman.length ; i++) {
            total=total+eleman[i];
        }
        double ort=total/ eleman.length;
        System.out.println("ort= " + ort);
    }

}
