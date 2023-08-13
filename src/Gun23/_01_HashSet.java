package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi=5; // hafızada sadece 1 sayi saklıyor
        int []dizi=new int[6];// Hafızada 6 sayı saklıyor; sabir boyutlu
        ArrayList<Integer> liste=new ArrayList<>();// boyu değişken ,sınır yok
        // javacım şu ana kadar cverdiğin değişkenler için teşekkürederim .
        // bir çok işimi gördü.bana öyle bir dizi ver ki içinde
        // tekrar eden değerler olmasın, ve bazen istersem herzaman sıralı olsun ,bazen istersem
        // eklendiği sırada sıralı olsun, bazen de sen olabildiğince hızlı çalış sıra
        // önemli olmasın
        // sevgili ahmet sen hiç meraak etme bu iş için hazırlanmış SET ler adını
        // verdiğimiz özel diziler var.
        // HashSet-> sen ekledikçe ,ekleme sırasına göre tutuyor.
        //TreeSet-> sen ekledikçe onları herzaman sıralı tutuyor.
        // bunların ortak özelliği TEKRAR eden DEĞER YOK.
        HashSet<Integer>hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMi= hs1.add(5);// tekrar eklendi.acaba diziyi kabul etti mi?
        hs1.add(2);// tekrar eklendi. acaba diziyi kabul etti mi?
        System.out.println("hs1 = " + hs1);
        System.out.println("eklendiMi = " + eklendiMi);
    }
}
