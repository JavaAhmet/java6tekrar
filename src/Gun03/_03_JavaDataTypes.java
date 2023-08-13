package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayı; // hafızada  int kadar yer kaplar, sadece tam sayı atılabilir
        // tam sayılarda default int

        // tam sayilar
        byte byteDeger = 7; // - 128 - 127
        short shortDeger = 1645; // - 32000 - 32000
        int intDeger = 250000;
        long longDeger = 343434343434343434L;

        // ondalıklı sayılar.default.double
        // ondalıklı sayılar
        double doubleDeger = 3.14314314314314314;// noktadan sonra 16 haneye kadar saklar
        float flotDeger = 3.143434f; // noktadan sonra 5 -7 hane hassasiyeti var ama kararsızdır


        // karakter ve harfler
        char basHarf = 'A'; // bir tane harf saklalyabilir
        String isim = "İsmet"; // kelime veya cümle saklayabilir, uzunluğu değişken

        System.out.println("byteDeger = " + 7);
        System.out.println("shortDeger = " + 1645);
        System.out.println("intDeger = " + 250000);
        System.out.println("longDeger = " + 343434343434343434l);
        System.out.println("doubleDeger = " + 3.1431431431431434);
        System.out.println("flotDeger = " + 3.143434f);
        System.out.println("basHarf = " + 'Ğ');
        System.out.println("isim = " + "İsmet");


    }
}
