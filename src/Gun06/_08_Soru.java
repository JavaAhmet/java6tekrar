package Gun06;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //Girilen bir ad soyadı örneğin "Ismet Temur" I.T. şeklinde yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("Adınız ve Soyadınız:");
        String adSoyad= oku.nextLine();
        char ilkharf= adSoyad.charAt(0);
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf= adSoyad.charAt(boslukIndex+1);
        System.out.println(ilkharf+"."+soyadIlkHarf+".");




    }
}
