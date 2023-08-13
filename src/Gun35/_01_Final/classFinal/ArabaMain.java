package Gun35._01_Final.classFinal;

public class ArabaMain {
    public static void main(String[] args) {
        Tasit t1=new Tasit();
        t1.model="opel";

        Tasit t2=new Tasit();
        t2.model="model";

        // class final olursa eğer main de birden
        // fazla çağrılabiliyor.
        // fakat başka class a extens edilmez
    }
}
