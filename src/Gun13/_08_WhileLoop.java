package Gun13;

import java.util.Scanner;

public class _08_WhileLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği 20 sayıdan tek olnların toplamını bulunuz.
        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;
        while (sayac<=6) {

            System.out.println("sayı gir=");
            int sayi= oku.nextInt();
            int kalan=sayi%2;
            if (kalan==1)
            toplam=toplam+sayi;
            sayac++;
        }

        System.out.println("toplam = " + toplam);

    }
}
