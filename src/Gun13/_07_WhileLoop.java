package Gun13;

import java.util.Scanner;

public class _07_WhileLoop {
    public static void main(String[] args) {
        //1 de 100 e kadar olan sayıların toplamını bulunuz.
       // Scanner oku=new Scanner(System.in); İPTAL
        int sayac=1;
        int toplam=0;
        while (sayac<=100) {

          toplam=toplam+sayac;
           // System.out.println("sayı gir="); İPTAL
           // int sayi= oku.nextInt(); İPTAL
           // toplam=toplam+sayi;
            sayac++;
        }

        System.out.println("toplam = " + toplam);
    }
}
