package gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {

        // \n -> yeni satır aç, alt satıra geçer
        // \t -> tab tuşuna bas , 3,4 harflik boşluk oluştur
        // \b -> backspace etkisi oluştur, yani 1 karakter geri siler
        // \" -> tırnak yazdırmak için kullanılır
        // \\ -> ekrana bir tane \ yazar
        // \r -> satır başına git

        System.out.println("MerhabaDünya");     // MerhabaDünya
        System.out.println("Merhaba\nDünya");   // Merhaba yazar, sonra alt satıra geçer Dünya yazar
        System.out.println("Merhaba\tDünya");   // Merhaba    Dünya (tab tuşu kadar boşluk)
        System.out.println("Merhaba\bDünya");   // MerhabDünya
        System.out.println("Merhaba\b\bDünya"); // MerhaDünya
        System.out.println("Merhaba\"Dünya");   // Merhaba"Dünya
        System.out.println("Merhaba\\Dünya");   // Merhaba\Dünya
        System.out.println("Merhaba\rDünya");   // Dünya (Merhaba Dünya yazıp Merhaba yı silip satır başına Dünya yazar)
        }
}
