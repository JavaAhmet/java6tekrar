package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        // Kullanıcıya öğrenci misiniz şeklinde sorunuz.
        // Evet ise True, değil ise false cevabını veriniz,
        //ve alınan cevabı yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println("Öğrenci misiniz");
        boolean cevap=oku.nextBoolean();// True veya Flase
        System.out.println("cevabınız = " + cevap);

    }


}
