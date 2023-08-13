package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

        //Girilen bir stringin sadece son harfini yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.println("cümle=");
        String cumle= oku.nextLine();
         //uzunluk 12 length-1 son harfi verir



       int uzunluk =cumle.length();
       char sonHarf=cumle.charAt(uzunluk-1);
        System.out.println("sonHarf="+sonHarf);
        //2. yöntem
        System.out.println("sonharf="+cumle.charAt(cumle.length()-1));



    }
}
