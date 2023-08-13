package Gun08;

public class _04_JavaAricmeticOperators {

    public static void main(String[] args) {
        int a=9;
        int b=5;

        System.out.println("Toplama İşlemi");
        System.out.println("a+b sonucu=" + (a+b));//14

        System.out.println("çıkarma işlemi");
        System.out.println("a-b sonucu=" + (a-b));//4
        System.out.println("çarpma işlemi");
        System.out.println("axb sonucu=" + (a*b));//45
        System.out.println("Bölme işlemi=");
        System.out.println("a/b sonucu=" + (a/b));

        // normal sonuç 1.8, fakat bilgisayar 2 side tam sayı tipinde ise, küsüratı atar
        // bu sebeble sonuç 1 olur, yuvarlama yapmaz, int/int=int
        //küsüratlı sonuç istiyorsan , işleme girenlerden en az birisi double olmalı
        System.out.println("(double)a/b sonucu="+((double)a/b));

        /*****************************************/
        System.out.println("Modül işlemi :bölümden kalan demek");
        System.out.println("a%b="+(a%b)); //4
        System.out.println("b%a="+(b%a)); //5
        int sonuc=145/10;
        System.out.println("sonuc = " + sonuc);


    }
}
