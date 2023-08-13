package Gun19;

import java.util.Arrays;
import java.util.Scanner;
public class _01_Java2DArrays {
    public static void main(String[] args) {
        // Günün sorusu: 3*2 lik bir diziyi kullanıcıdan sayı alarak doldurduktan sonra
        // sadece tek elemanlarını tek boyutlu bir diziye atyınız.
        Scanner scanner=new Scanner(System.in);
        int tablo[][]=new int[3][2]; // 3 satır 2 sütun
        int tekMiktar=0;
       // okuma işlemi yapıldı tablonun tüm hücreleri sayı ile doldurdu.
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("sayi giriniz=");
                tablo[i][j]= scanner.nextInt();
                if (tablo[i][j] %2==1)
                tekMiktar++;
            }
        }
            int[] tekler= new int[tekMiktar];// teklerin miktarı kadar bir dizi tanımlandı.
        int teklerIndex=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (tablo[i][j] % 2 == 1) {
                    tekler[teklerIndex] = tablo[i][j];
                    teklerIndex++;
                }
            }
        }
        System.out.println(Arrays.toString(tekler));
    }

}
