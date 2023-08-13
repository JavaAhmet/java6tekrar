package Gun39._02_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a = " + a.mesaj);
        B b=new B();
        System.out.println("b = " + b.mesaj);
        A a2=new A();
        System.out.println("a2 = " + a2.mesaj);
        a2.mesaj="sadece merhaba";
        System.out.println(a2.mesaj);// a nesnesine etkisi yok

        // çıktısı ne olur
    }
}
