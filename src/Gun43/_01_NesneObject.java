package Gun43;

import java.util.ArrayList;

public class _01_NesneObject {
    public static void main(String[] args) {
        // herşey bir nesne (Object) ?
        // Kisi ogr1=new Student();
       // Object ogr1=new Student();
        ArrayList<Object> genelList=new ArrayList<>();
        genelList.add(1);
        genelList.add("ismet");
        genelList.add(2,7);
        genelList.add(true);

        System.out.println("genelList = " + genelList);
        // her tip eklenebiliyor.çünkü bütün tipler object türetildiği için

        double oran=10/3.0;
        System.out.println("oran = " + oran);
        //System.out.printf("formatı", değişkenleri);
        System.out.printf("%f",oran); //  %f: %değişkenin geleceği yer
                                        // f:double,float kesirli


        System.out.println();
        System.out.printf("sonuc=%4.1f\n",oran);
        // 4: toplamda 4 tane kullanılacak nokta dahil
        // 1: noktadan sonra kaç tane kullanılacak

        System.out.printf("sonuc= %4.1f\n",oran); // sola dayalı
        int sayi=5;
        System.out.printf("Sonuc=%-5.2f,tamSayi=%d",oran,sayi);
        //f: double veya float
        //d: decimal ondalıklı sayı
        // s:string değişkenler







    }
}
