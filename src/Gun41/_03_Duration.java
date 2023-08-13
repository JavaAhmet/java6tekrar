package Gun41;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {
        // Duration: localTime ve LocalTimeData lar arası fark için kullanılır.
        long startTime=System.currentTimeMillis();
        //LocalTime
        LocalTime dersBaslangic=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(21,50,5);
        Duration gunlukDersSuresi=Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi.toDays() = " + gunlukDersSuresi.toDays());// toplam hali
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi.toHours()); // toplam hali
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi.toMinutes()); // toplam hali
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi.toMillis()); // toplam hali
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi.toNanos()); // toplam hali

        System.out.println("******************LocalDateTime*************************");
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now(); // bugün
        Duration fark = Duration.between(from,to);

        System.out.println("fark = " + fark.toDays()); // farkın toplam günü
        System.out.println("fark = " + fark.toHours()); // toplam sati
        System.out.println("fark = " + fark.toMinutes()); // toplam dakikası

        System.out.println("*****************Kodun Performansı*****************************");
        // Şu andaki milisaniye cinsindeb zaman
        long finishTime=System.currentTimeMillis();
        System.out.println("Geçen süre= " + (finishTime-startTime)+" ms");

    }
}
