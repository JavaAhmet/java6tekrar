package Gun43;

import java.util.Scanner;

public class _08_ThrowExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yeni Şifre Oluşturunuz");
        System.out.println("Yeni Şifre");
        String newPassword= scanner.nextLine();

        if (newPassword.length()< 8)
        {
            System.out.println("Lütfen Dikkat!");
            System.out.println("En az 8 karakter olmalı");
            // hangi IP BAGLANDI KAYDEDERSİN
            // YAPILACAK ORTK İŞLER
        }

        if (newPassword.length()>15)
        {
            System.out.println("Lütfen Dikkat");
            System.out.println("En fazla 15 karakter olmalı");
            // hangi IP BAGLANDI KAYDEDERSİN
            // YAPILACAK ORTK İŞLER

        }
    }
}
