package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.
        int[] array=new int[10];
        for (int i = 0; i < array.length ; i++) {
             array[i]=(int) Math.random()* 11;
            System.out.println("array = " + Arrays.toString(array));
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println(" aranacak sayı(0-10)=");
        int aranansayi=scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i]== aranansayi)
                System.out.println("var, oda numrası (index)="+i);
        }

    }
}
