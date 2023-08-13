package Gun08;

public class _05JavaAricmeticOperators {
    public static void main(String[] args) {
        int sayac=0;
        sayac=sayac +1; // sayasayacın değerini 1 tane arttırıyor:1
        sayac ++; // sayacın değerini 1 tane arttırıyor:2
        ++ sayac; // sayacın değerini 1 tane arttırıyor:3
        sayac= sayac-1; //sayacın değerini 1 azaltır:2
        sayac--; // sayacın değerini 1 azaltır:1
        --sayac; // sayacın değerini 1 azaltır:0

        System.out.println("sayac = " + sayac);

        /**************************************************/
        int toplam = 0; int sayi=0;
        // toplama işleminden önce: toplam =0, sayi =0
        toplam =5 + sayi;
        // toplama işeminden sonra : toplam =5, sayi =0;
        System.out.println("toplam = " + toplam);

        /*****************************************************/
         int toplam1=0; sayi=0;
        // toplama işleminden önce : toplam =0, sayi=0
        toplam =5 + sayi++; // önce toplam =5+sayi ; sonra sayi++;
        // toplama işleminden sonra : toplam =5, sayi=1
        System.out.println("toplam = " + toplam);

        /****************************************************/
        int toplam2 =0; sayi=0;
        // toplama işleminden önce : toplam=0, sayi =1
        toplam =5 +  ++sayi; // önce  ++sayi; sonra  toplam=5 +sayi;
        //işlemden sonra : toplam =6 ,sayi=1
        System.out.println("toplam = " + toplam);



    }
}
