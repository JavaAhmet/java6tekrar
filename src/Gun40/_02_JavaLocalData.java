package Gun40;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class _02_JavaLocalData {
    public static void main(String[] args) {
        // LocalDate sadece gün ay bilgisini tutar
        LocalDate tarih=LocalDate.now(); // şu andaki tarihi verir

        DateTimeFormatter oz6=DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy ");
        System.out.println("tarih.format(oz6) = " + tarih.format(oz6));

        System.out.println("*****Başka Dilde Formatta göster");
        //Localden aldığım tarihi başka dilde formatta gösterme.
        System.out.println("Almanca tarih=" +tarih.format(oz6.withLocale(Locale.GERMAN)));
        // Lokalizasyon tanımlaması ne demek

        //en-US
        //en-UK
        //fr-CA-->kanadanın fransızca konuşulan bölgesi
        //en-CA
         Locale lCince=new Locale("zh","CH"); // ÇİNİN ZH KONUŞULAN  BÖLGESİ
        System.out.println("Çince Tarih="+tarih.format(oz6.withLocale(lCince)));

        // Kullanılabilir Localleri bulma

        Locale[] kullanilabilirLocaller=Locale.getAvailableLocales();
        for (Locale l:kullanilabilirLocaller){
            if (!l.getDisplayLanguage().toLowerCase().contains("ind"))continue;
            System.out.println("Dili"+l.getDisplayLanguage());
            System.out.println("Ülkesi"+l.getDisplayCountry());
            System.out.println("dili="+l.getLanguage());
            System.out.println("ülkesi="+l.getCountry());
        }
            Locale lTurkiye=new Locale("tr","TR");
        System.out.println("Türkçe Tarih:"+tarih.format(oz6.withLocale(lTurkiye)));

        System.out.println("\n**********************");

        // tarih=2053-5-20
        LocalDate tarih1=LocalDate.of(2053,5,20);
        LocalDate tarih2=LocalDate.of(2053, Month.MAY,20);
        System.out.println("tarih2.format(oz6)="+tarih2.format(oz6));




    }
}
