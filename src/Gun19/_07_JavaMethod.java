package Gun19;

import java.util.Arrays;

public class _07_JavaMethod {
    public static void main(String[] args) {
        // mainde 20 elemanlı bir diziyi tanımlayınız,daha sonra bir fonksiyona göndererek
        // random 100 e kadar olan sayılarla doldurarak aynı fonksiyonda yazdırınız.
        int dizi[]=new int[20];
        Sayiyazdir(dizi);
    }

    public static void Sayiyazdir(int []dizi){
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(dizi));
    }
}
