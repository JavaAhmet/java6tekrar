package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _05_JavaTryCatch {
    public static void main(String[] args) {

        try { // dene hatanın başladığı yerin üstüne konu
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30); // RUNTİME ERROR


        } // HATA OLDUĞU ZAMAN PROGRAMI KIRMAZ
        catch (Exception ex) // EX İSİMLİ DEĞİKENE OLUŞAN HATALARIN BİLGİSİ ATILIYOR
        {// HTA OLDUĞUNDA YAPILMASI İSTENENLER BURAYA YAZILIYOR
            System.out.println("Hata oluştu = " + ex);
            System.out.println("ex.getMessage() = " + ex.getMessage());
            // LOG TUTABİLİRSİN ,EKRANINI FOTOGRAFINI ALABİLİRSİN

        }
        System.out.println("Program Bitti");

        // JAVA KURDUNDA HATA DURUM YÖNETİMİ

        try {
            //Java ve Toolları çalımayaevam et
            // konuları grupla çalışmaya devam et
        } // anlamadığın yerler mi oldu runtime error
        catch (Exception ex) {
            // hatanın sebebini anla
            // derse daha fazla odaklan
            //anlamadığın yerleri sor
            //videoları tekrar izle
            // grup çalışmasına devam et
        }



    }
}
