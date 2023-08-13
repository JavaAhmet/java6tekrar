package Gun07;

public class _10_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase: string küçük harfe çevirir.

        String text="Merhaba Dünya";
        System.out.println("orijinal hali = " + text); //Merhaba Dünya
        System.out.println("tex.toLowerCase() = " + text.toLowerCase());

        boolean basliyorMu= text.startsWith("M"); // true
        boolean balyorMu2= text.startsWith("m"); //false
        boolean basliyorMuIgnoreCase=text.toLowerCase().startsWith("m");
            //merhaba dünya                               // true
        System.out.println("basliyorMu = " + basliyorMu);
        System.out.println("balyorMu2 = " + balyorMu2);
        System.out.println("basliyorMuIgnoreCase = " + basliyorMuIgnoreCase);



    }
}
