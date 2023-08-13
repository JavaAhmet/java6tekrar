package Gun06;

public class _04_StringCharAt {
    public static void main(String[] args) {

        //istenilen noktadaki karakteri verir
        //                      111
        //            0123456789012

        String cumle="Merhaba Dünya"; // uzunluğu =13, 0-12 sıfırdam başladığı için index deniyor.
        System.out.println("uzunluk="+cumle.length());
        // ilk harf nasıl alınır
        char ilkHarf= cumle.charAt(0); // 0 daki karakteri ver
        System.out.println("ilkHarf="+ilkHarf);






    }
}
