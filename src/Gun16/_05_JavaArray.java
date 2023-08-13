package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.
        Scanner scanner=new Scanner(System.in);
        double total=0;
        int passers=0;

        int[] array=new int[7];
        for (int i = 0; i < array.length ; i++) {
            System.out.print((i+1)+".entry number=");
            array[i]= scanner.nextInt();
            total=total+array[i];
        }
       double average=total/ array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>average && array[i]%2==1) {
                passers++;
            }

        }
        System.out.println("average = " + average);
        System.out.println("passers = " + passers);



    }
}
