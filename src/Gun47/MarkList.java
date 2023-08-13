package Gun47;

public class MarkList {

    int num;

    public static void graceMarks(MarkList obj4) {// fonksiyondaki adı obj4 ama obj1 ve obj2 dir.
        obj4.num += 10; // fonksiyona nesnenin kendisi gider .aynı dizi gibi
    }

    public static void main(String[] args) {
        MarkList obj1 = new MarkList();
        System.out.println("obj1 = " + obj1);
        MarkList obj2 = obj1;
        System.out.println("obj2 = " + obj2);
        MarkList obj3 = null;


        obj2.num = 60;
        System.out.println("obj2 = " + obj2.num);
        System.out.println("obj1 = " + obj1.num);
        graceMarks(obj2);// aynı zamanda obj1
        System.out.println("obj2 = " + obj2.num);
        System.out.println("obj1 = " + obj1.num);
    }
}
// hafizada kaç tane MarkList NESNESİ vardır.
// How many MarkList instances are created in memory at runtime?
//Çaliştırınca kaç tane MarkList kurulumu yaratılmıştır (nesnesi)
