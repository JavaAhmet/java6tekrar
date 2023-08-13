package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.
        Scanner read=new Scanner(System.in);
        System.out.println("password:");
        String password= read.nextLine();

        if (password.length()>=8 && !password.toLowerCase().contains("pass") && password.length()<=12 )
        System.out.println("confirm");
else
        System.out.println("false");


    }
}
