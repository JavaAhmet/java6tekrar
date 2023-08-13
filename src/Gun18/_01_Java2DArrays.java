package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
      int sayi=0; // 1 tane sayı saklar
        int [] dizi=new int[100]; // 100 sayı saklar

        int [] ders1not=new  int[50];
        int [] ders2not=new  int[50];
        int [] ders3not=new  int[50];
        int [][] tumdersNotlari=new int[3][50];// 3 tane 50 lik sayı saklayabiliyor
        ders1not[0]=80; // tek boyutlu dizinin elemanı
        tumdersNotlari[0][0]=80; // 2 indexle gösterilir, tablonun ilk elemanı
        System.out.println("tumdersNotlari[0][0] = " + tumdersNotlari[0][0]);
      Scanner scanner=new Scanner(System.in);
      tumdersNotlari[0][0]= scanner.nextInt();


    }
}
