package Gun09;

import java.util.Scanner;

public class _00_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.
        // true veya false

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı =");
        int sayi= oku.nextInt();

        int kalan= sayi%2; // 1 ise tektir
        System.out.println("tek mi="+ (kalan==1));

        //2.yöntem
        boolean tekMi=(kalan==1); // (kalan%2==1)
        System.out.println("tek mi="+ tekMi);


    }
}
