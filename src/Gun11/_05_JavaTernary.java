package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Otopark ücretleri : (Ternary operatör ile yapınız.)
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız.
        Scanner read= new Scanner(System.in);
        System.out.println("hour tl =");
        double hour= read.nextDouble();
         //double sonuc=hour<=3?10 :  hour<=5?15 :  20;
       // System.out.println("sonuc = " + sonuc);
        String ucretStr= (hour<=3)? "10 tl": (hour<=5)? "15tl": "20 tl";
        System.out.println("ucretStr = " + ucretStr);
        //2. yöntem
        System.out.println(hour<=3?"10tl":hour<=5?"15tl":"20tl");



    }
}
