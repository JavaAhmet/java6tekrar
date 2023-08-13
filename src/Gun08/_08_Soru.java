package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // user will entry  two numbers each
        // are they eguals olup olmadığını yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("Birinci sayi");
        int sayi1= oku.nextInt();
        System.out.println("İkinci sayi=");
        int sayi2= oku.nextInt();
        System.out.println("Eşit mi= "+ (sayi1==sayi2));
    }
}
