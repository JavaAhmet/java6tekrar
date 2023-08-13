package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        //Period 2 tarih arasındaki farkı tutar
        // LocalDate le için kullanılır

        LocalDate dogumTarihi=LocalDate.of(1984,12,06);
        LocalDate bugun=LocalDate.now();
        Period fark= Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);
        System.out.print("fark.getYears() = " + fark.getYears() +" "+"yıl");
        System.out.println();
        System.out.print("fark.getMonths() = " + fark.getMonths() +" "+"ay");
        System.out.println();
        System.out.println("fark.getDays() = " + fark.getDays() +" "+"gün");

        Period period3Gun = Period.ofDays(3);
        Period period3ay=Period.ofMonths(3);
        System.out.println("period3ay = " + period3ay);
        System.out.println("period3Gun = " + period3Gun);

        LocalDate ucgunSonrasi=bugun.plusDays(3);
        System.out.println("ucgunSonrasi = " + ucgunSonrasi);
        LocalDate ucaySonra=bugun.plusMonths(3);
        System.out.println("ucaySonra = " + ucaySonra);
        /************************************************************/
        //Kursun bitiş tarihini bulunuz

        LocalDate kursbaslamaTarihi=LocalDate.of(2023,05,15);
        LocalDate kursbitisTarihi=kursbaslamaTarihi.plusMonths(6);
        System.out.println("kursbitisTarihi = " + kursbitisTarihi);
        // 2. yol
        LocalDate kursBaslangic=LocalDate.of(2023,5,15);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursbitis=kursBaslangic.plus(kursSure);
        System.out.println("kursbitis = " + kursbitis);
        System.out.println("kursbitis günü = " + kursbitis.getDayOfWeek());

        // kursun bitmesine ne kadar süre kaldı

      Period neKadarSureKaldi=Period.between(bugun,kursbitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        //3. Soru Ne kadar süre devam ediyor
        Period suanaKadarDevamSuresi=Period.between(kursBaslangic,bugun);
        System.out.println("suanaKadarDevamSuresi = " + suanaKadarDevamSuresi);

    }
}
