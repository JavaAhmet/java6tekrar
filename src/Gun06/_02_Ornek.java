package Gun06;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde (s). Sokak (s) , Postakodu(int) ve ülke(s), ev sahibi misiniz  şeklinde
        // adres bilgisini alarak yazdırınız.

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        Scanner okuBool=new Scanner(System.in);

        System.out.print("Cadde=");
        String cadde= okuStr.nextLine();
        System.out.print("Sokak=");
        String Sokak= okuStr.nextLine();

        System.out.print("Posta Kodu=");
        int PostaKodu= okuInt.nextInt();

        System.out.print("Ülke=");
        String ulke= okuStr.nextLine();

        System.out.print("Ev sahibi misiniz (t/f)");
        Boolean evSahibimi=okuBool.nextBoolean();
        System.out.println("Adres="+cadde+" "+Sokak+" "+PostaKodu+" "+ulke+" "+evSahibimi);


    }
}
