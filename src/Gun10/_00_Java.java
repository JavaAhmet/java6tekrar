package Gun10;

import java.util.Scanner;

public class _00_Java {
    public static void main(String[] args) {
        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.(comfirm new password)
       // Scanner read=new Scanner(System.in);
       // System.out.println("password1=");
      //  int password1= read.nextInt();
      //  System.out.println("password2=");
       // int password2= read.nextInt();
     //   System.out.println("password2 = " +password1);
        //System.out.println("password2 = " + password2);
        //if (password1==password2)
      //      System.out.println("AYNI");
     //   if (password1!=password2);
      //  System.out.println("DEĞİL");
        // diğer yöntem

        Scanner read1=new Scanner(System.in);
        System.out.println("şifreniz=");
        String sifre= read1.nextLine();
        System.out.println("Şifreniz Tekrar=");
        String sifreTekrar=read1.nextLine();
// sTRİNG KARŞILAŞTIRMALARDA == KULLANILMAZ
       // if (sifre==sifreTekrar); // == String lerde hafızadaki yerlerini kontrol eder
     //   System.out.println("AYNI==");

        // olması gereken String ifadelerde bu iş için yapılmış olan
        // içerik karşılaştırıcı olan EQUALS kullanılmalı.
        if (sifre.equals(sifreTekrar)== true)
            System.out.println("AYNI");
        if (sifre.equals(sifreTekrar)==false);
        System.out.println("DEGİL");




    }
}
