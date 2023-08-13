package Gun03;

public class _07_Ornek3 {
    public static void main(String[] args) {
        // kisinin kilonuz (kg) ve boyunu (m) kendiniz veriniz.
        // ekrana kilonuz : ..... ve boyunuz = .... yazdıktan sonra
        // vücut kitle indeksini bulunuz : kilo/ (boy*boy)

        double kilo= 78.5;
        double boy = 1.74;
         double vucutkitleindeksi = 78.5/(1.74*1.74); // yada double kitleIndex= kilo/(boy*boy)
        // işleme 1 tane ondalıklı girerse doubleden hesaplanır.

        System.out.println("kilonuz="+ kilo + ", boyunuz=" + boy);
        System.out.println("vucut kitle indeksi = " + vucutkitleindeksi);

        System.out.println("arkadaş durumun normal ama üzüm yemeye devam et");




    }
}
