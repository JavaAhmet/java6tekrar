package Gun40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _01_JavaLocalData
{
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getMonth() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonth() = " + tarih.getMonthValue());
        System.out.println("tarih.getMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getMonth() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getMonth() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getMonth() = " + tarih.getDayOfYear());

        // KENDİSİNDEKİ HAZIR FORMATLARI GÖRELİM.WİNDOWSUN YEREL AYARLARIN GÖRE DEĞİŞEBİLİR.

        System.out.println("ISO DATA="+tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SORT="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
// istediğimiz formatta gösterim
        System.out.println("\n************ istediğiniz formatta gösterin *************");
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("ozelFormat1 = " +tarih.format(ozelFormat1));

        DateTimeFormatter oz2=DateTimeFormatter.ofPattern("dd.M.yyyy");
        System.out.println("oz2 = " +tarih.format(oz2));
        DateTimeFormatter oz3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih.format(oz3) = " + tarih.format(oz3));

        DateTimeFormatter oz4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih.format(oz4) = " + tarih.format(oz4));

        DateTimeFormatter oz5=DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.yyyy");
        System.out.println("tarih.format(oz5) = " + tarih.format(oz5));

        DateTimeFormatter oz6=DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih.format(oz6) = " + tarih.format(oz6));
        // kısa yol
        System.out.println("MMMM dd EEEE yyyy=" +tarih.format(DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy")));

    }
}
