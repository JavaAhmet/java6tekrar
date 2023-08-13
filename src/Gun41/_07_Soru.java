package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız bir Toplam rakamı, kullanıcının vereceği  başlangıç tarihine göre
        // yine kullanıcnın verdiği kadar taksit yaptırarak, ödeme planını ekrana yazdırınız.

        // Kullanıcıdan tarih, para miktarı ve taksit sayısı alınacak
        // Çıktı olarak taksit no, taksit tarihi, ödenecek miktar şeklinde liste verilecek

        Scanner scannerInt=new Scanner(System.in);
        Scanner scannerStr=new Scanner(System.in);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // Tarihi alalım
        System.out.print("Taksit Baş. Tar. (01.05.2023) = ");
        String strTarih=scannerStr.nextLine();
        LocalDate basTarih=LocalDate.parse(strTarih,f);

        // Toplam Para Miktarını alalım
        System.out.print("Taksitlendirilecek Miktar (TL) =");
        int toplamPara=scannerInt.nextInt();

        // Taksit sayısı
        System.out.print("Taksit Sayısı=");
        int takSayisi=scannerInt.nextInt();

        int takMiktari=toplamPara/takSayisi; // 1 aya düşen tksit miktarı

        System.out.println("****Ödeme Planınız****");

        for (int i = 1; i <= takSayisi ; i++) {
            System.out.print(i);
            System.out.print(" "+basTarih.plusMonths(i-1).format(f));
            System.out.println(" "+takMiktari+" "+ "TL");
        }



    }
}
