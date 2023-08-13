package Gun43;

public class _02_StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1="Bugün hsva çok güzel";
        String cumle2="Bugün hava çok güzel";

        if (cumle1==cumle2)
            System.out.println("cumle1 ve cumle2 eşit");
        else
            System.out.println("cumle1 ve cumle2 eşit DEĞİL");

        if (cumle1.equals(cumle2))
            System.out.println("cumle1 ve cumle2 eşit");
        else
            System.out.println("cumle1 ve cumle2 eşit DEĞİL");

        // REFERANS TİPLERDE İSE DURUM SCANNER İLE
        // EKRANDAN OKUNDUĞU İÇİN AŞAĞIDAKİ GİBİ OLUR
        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        // manası referansları aynı mı
        if (cumle3==cumle4) // == REFERANS TİPLERDE REFRANSLAR AYNI MI
            System.out.println("cumle3 ve cumle4 eşit");
        else
            System.out.println("cumle3 ve cumle4 eşit DEĞİL");

        // Değerler aynı mı
        if (cumle3.equals(cumle4))
            System.out.println("cumle3 ve cumle4 eşit");
        else
            System.out.println("cumle3 ve cumle4 eşit DEĞİL");

        // ÖZET : Nesne(String) ve referans(dizi,ArrayList,Nesneler) tiplerde
        //        HERZAMAN EQUALS kullanılır.
        //        İlkel (Sayısal, boolean) tiplerde == kullanılır.

    }
}
