package Gun43;

import java.util.Scanner;

public class _08_ThrowExample_02 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Yeni Şifre Oluşturunuz");
        System.out.println("Yeni Şifre");
        String newPassword= scanner.nextLine();

        try{

        if (newPassword.length()<8)

            throw new Exception ("Şifre en az 8 karakter olmalı");

        if (newPassword.length()>15)
            throw new Exception("Şifre en fazla 15 karakter olmalı");

        }
        catch (Exception ex)
        {
            // hatalar bir yere toplanıp,hepsi için yapılması gerekenler işlemler
            // birarada burada yapılabilir .mesela log tutma gibi
            System.out.println("Lütfen Dikkat!");
            System.out.println(ex.getMessage());
            // hangi ip bağlandı kaydedersin
            // yapılan ortak işler

        }

    }

}
