package Gun08;

public class _06_JavaAssignmentOperators {
    public static void main(String[] args) {

int a = 10; // a  ya 10 değer atandı
        a=5; // a ya 5 değeri atanmış olur
        a = a+6; // a ya  değerini ekle 11 oldu
        a+=6 ; // a ya 6 değerini ekle 17 oldu
        // a nın artış değeri 6 ya eşit
        
        a=a+1; // a yı 1 artır
        a++; // a yı 1 artır
        ++a; // a yı 1 artır
        a+=1;// a yı 1 artır
        
        /************************************/
        
        a=a-1; // a yı 1 azaltır
            a--; // a yı 1 azaltır
            --a; // a yı 1 azaltır
            a-=1; // a yı 1 azaltır
            a-=25; // a yı 25 azalt

        
        /*********************************************/
        
        int b=10;
        //b=b/5; // b yi 5 e böl
        b/=5; // b yi 5 e böl: b nin bölen değeri 5 dir.
        System.out.println("b = " + b);
        /***********************************************/

        int c=10;
        c=c*5; // c yi 5 ile çarp 50
        c*=5; // c yi 5 ile çarp 50: c nin çarpan değeri 5 e eşittir.
        System.out.println("c="+c);

    }
}
