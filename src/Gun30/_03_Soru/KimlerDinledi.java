package Gun30._03_Soru;

public class KimlerDinledi {
    int a;
    static  int b=0;
    // burada class ın içinde bir tane fonksiyon yapacaz.
   // fonksiyonun ismi "void artir" olsun
    void  artir()
    {
        a++;
        b++;
    }

    public static void main(String[] args) {
        KimlerDinledi kd1=new KimlerDinledi();// yukardaki class tan kimler dinledi tipini aldık.
        kd1.a=5;// kd1 in a snının değeri 5

        KimlerDinledi kd2=new KimlerDinledi();
        kd2.a=7;

        // 1. soru: a nın değeri şu anda kaçtır? burada hangi a yı soruyor hoca static olmadığı için d-farklı nesneler
        // burada her nesnenin a sı var ve kd1 in 5, kd2 nin 7 değeri var.
        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);

        // 2.soru b nin değeri kaçtır? tek bir değeri vardır o da 0 dir.
        // yukarda void artır fonksiyonuna binaen geldim burada
        kd1.artir();// kd1.a->6,b->1
        kd2.artir(); // kd2.a->8,b->2 olur

        // 3. soru: a ve b nin değerleri kaçtır
        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);
        System.out.println("b = " + b); // b bir tane static



    }
}
