package Gun06;

public class _07_StringLastIndex0f {
    public static void main(String[] args) {
        //index0f: baştan itibaren arayıp oda numarasını döndürür
        //lastIndex0f: sondan itibaren aramaya başlar

        //             0123456789012
        String cumle= "Merhaba Dünya";
        System.out.println("cumle.index0f(a)"+cumle.indexOf("a")); //4
        System.out.println("cumle.lastIndex0f(a)="+cumle.lastIndexOf("a"));//12
        //index her zaman tektir, arama yönüne göre değişmez
        System.out.println("cumle.lastIndex0f(a,8)="+cumle.lastIndexOf("a",8));//6
        //sondan gelerek aramaya 8 nolu odadan başla


    }
}
