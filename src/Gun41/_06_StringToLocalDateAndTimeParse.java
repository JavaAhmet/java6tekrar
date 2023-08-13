package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _06_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // kullanıcıdan alınan ve String durumundaki time veya tarih 
        // bilgisinin time veya tarih bilgisine çevrilmesi

        Scanner scanner= new Scanner(System.in);
        System.out.println("Tarih Giriniz (25 01 2023) =");
        String strTarih= scanner.nextLine();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih=LocalDate.parse(strTarih,f);
        System.out.println("tarih = " + tarih.format(f));
    }
}
