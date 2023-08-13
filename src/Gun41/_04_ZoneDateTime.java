package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _04_ZoneDateTime {
    public static void main(String[] args) {

        ZonedDateTime zdt=ZonedDateTime.now();
        // şu anda benim bulunduğum yerin default zamnınıverir
        // LocalDateTime.now();
        // diğer zone ler için ZoneDateTYime.now(ZoneId)
        System.out.println("zdt = " + zdt);
        //  2023-07-25T08:07:44.103+03:00[Asia/Istanbul] ->zone Id yi temsil ediyor.
        // Locale.getAvailables(); gibi
        Set<String> zamanZoneIdleri= ZoneId.getAvailableZoneIds();

        for ( String z:zamanZoneIdleri){

            if (z.toLowerCase().contains("bul"))
                continue;

            System.out.println("z = " + z);
        }

          ZoneId zoneIdIstanbul=ZoneId.of("Europe/Istanbul");
          ZonedDateTime zoneIstanbul=ZonedDateTime.now(zoneIdIstanbul);
          System.out.println("zoneIstanbul = " + zoneIstanbul);
        //zoneIstanbul = 2023-07-25T08:16:42.290+03:00[Europe/Istanbul]
    }
}
