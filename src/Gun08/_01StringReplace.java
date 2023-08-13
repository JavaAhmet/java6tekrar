package Gun08;

public class _01StringReplace {
    public static void main(String[] args) {
        // replace: bir stringin içindeki karakterleri verilenle değiştir.hepsini
        String text= "Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println("text.replace (a,e) = " + text.replace("a","e"));// Merhebe Dünya
        System.out.println("text.replace (ba,de) = " + text.replace("ba","de"));// Merhede Dünya
        System.out.println("text.replace (Merhaba,Hello) = " + text.replace("Merhaba","Hello"));
        System.out.println("text.replace (a,'') = " + text.replace("a",""));// a lar silindi

    }
}
