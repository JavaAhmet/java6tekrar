package Gun16;

public class _01_JavaArray {
    public static void main(String[] args) {
        int sayi=0;

        int ogrNot=0;

        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
       // ...
       // ...
       // ...
        int ogrNot50;
        // bize bir tanımlamada birden fazla değer tutabilen bir değişkene ihtiyacım var.
        //Çözüm:
        int [] notlar=new int[50];// 50 tane int saklayabilen notlar isimli değişken
        notlar[0]=75;
        notlar[1]=88;
        //...
        //...
        notlar[49]=95;// en son eleman sayısı-1 length-1 dir.böylece 0-49 indextir.
        // 50. öğrenci notu
        //notlar[50]=56; challanger patlar

        System.out.println("notlar = " + notlar[0]);
        System.out.println("notlar = " + notlar.length);







    }
}
