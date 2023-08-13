package Gun21;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner scanner=new Scanner(System.in);
        Scanner scannerstr=new Scanner(System.in);
        ArrayList<Integer>notlar=new ArrayList<>();
        int toplam=0;
        String cevap="";
        do {
            System.out.println("not giriniz");
            int not= scanner.nextInt();
            notlar.add(not);
            toplam=toplam+not;
            System.out.print("Devam etmek istiyor musunuz? (E/H)");
            cevap=scannerstr.next();

           }while (cevap.equalsIgnoreCase("E")); //e yada E döngünün devamı şart öğretmenin istediği notlar girildi

            double ort=toplam/notlar.size();// ortalama bulundu
        System.out.println("ort = " + ort);

             int gecenSayisi=0; // BÜTÜN NOTLAR FOR İ İLE GÖZDEN GEÇİRİLDİ VE GEÇEN SAYISI BULUNDU
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>ort)
                gecenSayisi++;
        }

        System.out.println("gecenSayisi = " + gecenSayisi);

    }
}
