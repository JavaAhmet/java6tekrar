package Gun08;

public class _03StringReplaceAll {
    public static void main(String[] args) {


    //ReplaceAll: replace gibi çalışır .Farklı Kriter (regex) verilebiliyor
    // regex: regular exprassion /düzenli ifdade-açıklama
    // TODO (yapılacak): ödev : regex olarak neler yazılabiliyor google dan arştırılacak
    String text= "Merhaba1 Dünya234";
        System.out.println("text = " + text);
        System.out.println("text.replaceAll(\"[abn]= " + text.replaceAll("[abn]","_"));
        // a,b,n leri _yap > Merh___1 Dü_y_234

        System.out.println("text.replaceAll([A-Z] = " + text.replaceAll("[A-Z]","_"));
        // A Z YE KADAR HARFLERİ _ YAP-> _erhaba1 _ünya234
        System.out.println("text.replaceAll(\"[0-9]\",\"\") = " + text.replaceAll("[0-9]",""));
        // 0-9 arasını sil -> Merhaba Dünya

        System.out.println("text.replaceAll([^0-]) = " + text.replaceAll("[^0-9]",""));
        // 0-9 un ^# dışındakileri  sil -> 1234
        //dolar500 ->"500" ->parseInt
        System.out.println("text.replaceAll([\"A-Z\"], \"\").replaceAll(\"[]) = " + text.replaceAll("[A-Z]", "").replaceAll("[a,z]",""));



    }

}
