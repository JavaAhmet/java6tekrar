package Gun04;

public class _08_Ornek4 {

    public static void main(String[] args) {

        // int to String, rakamların yazıya çevrilmesi

        String ad= "İsmet Temur";
        int sinifNo=5;
        char subesi='A';
        boolean gectiMi= true;
        int s1 = 4;
        int s2= 6;


        System.out.println(4+6+ad+subesi+sinifNo+subesi+gectiMi);

        // + nın herhangi bir tarafında  String  var ise, diğer değişken otomatik String e dönüşür.

        System.out.println("merhaba" +1+2); //merhaba12

        System.out.println(1+1+"merhaba"); // 3merhaba
        // birleştirme işlem soldan sağa doğru gider.
        System.out.println((double)3/2);






    }
}
