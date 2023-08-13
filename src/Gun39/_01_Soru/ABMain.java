package Gun39._01_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a=new A(); // BİR ETKİSİ YOK. A CLASINDAN PUBLİC STATİCDEN ALDI ZATEN
        System.out.println("A.mesaj = " + A.mesaj);

            B b=new B(); // CONSTRUCTORADAN ALDI

        System.out.println("A.mesaj = " + A.mesaj);

        A a2=new A(); // değiştirici etkisi yok
        System.out.println("A.mesaj = " + A.mesaj);

        // ÇALIŞTIRAN ÇIKTI NE OLUR.
    }
}
