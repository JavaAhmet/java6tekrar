package Gun06;

public class _06_StringIndex0f {
    public static void main(String[] args) {
        // Index0f: verilen karakter(lerin) indexini verir
        //01234:harflerin oda numarası
        //bugün

        String cumle= "Merhaba Dünya";
        // h nin oda numarası kaç:3
        //a nın oda numarası kaç :4 tür
        //Dü nin indexi kaç:8

        System.out.println("cumle.index0f(M)="+cumle.indexOf("M"));//0
        System.out.println("cumle.index0f(h)="+cumle.indexOf("h"));//3
        System.out.println("cumle.index0f(a)="+cumle.indexOf("a"));//4
        System.out.println("cumle.index0f(Dü)="+cumle.indexOf("Dü"));//8
        System.out.println("cumle.index0f()="+cumle.indexOf(""));//7
        System.out.println("cumle.index0f(A)="+cumle.indexOf("A"));// -1 yok
        System.out.println("cumle.index0f(z)="+cumle.indexOf("z"));// -1 yok

        System.out.println("cumle.index0f(a,5)="+cumle.indexOf("a",5));//6
        // 5 nolu indexten sonra a hangi oda da
        System.out.println("cumle.index0f(a,7)="+cumle.indexOf("a",7));//12
        // 7 nolu indexten sonra a yı ara




    }
}
