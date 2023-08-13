package Gun18;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // 2x3 lük bir diziyi random 10 a kadar sayılarla doldurunuz.
        // daha sonra kullanıcıdan bir sayı alınız . bu sayı tabloda
        // var ise yerini satır, sütun yazdırınız

        int[][] tablo=new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3 ; j++)
                tablo [i][j]=(int)(Math.random()*10);

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3 ; j++)
                System.out.print(tablo[i][j]+" ");
            System.out.println();
        }
        Scanner scanner=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int arananSayi= scanner.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                if (tablo[i][j]== arananSayi)
                    System.out.println("i = " + i+ ", j="+j);


        }

    }
}
