package Gun07;

public class _09_StringEndsWith {
    public static void main(String[] args) {
        // EndWith: verilen karakter( ler) ile bitiyor mu
        // sonuc true veya false yani boolean döner
        String text ="Merhaba Dünya";
        System.out.println("text.endWith(ya) = " + text.endsWith("ya"));// true
        System.out.println("text.endWith(n) = " + text.endsWith("n"));// false
        System.out.println("text.endWith(A) = " + text.endsWith("A"));// false
        System.out.println("text.endWith(Dünya) = " + text.endsWith("Dünya"));// true


    }
}
