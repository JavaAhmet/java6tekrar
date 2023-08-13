package Gun09;

import java.util.Scanner;

public class _07_StringIf {
    public static void main(String[] args) {
        // girilen bir cümledeki küçük veya büyük a harfinin olup olmadığını yazsdrınız
        // var ve yok şeklinde
        Scanner oku=new Scanner(System.in);
       System.out.println("cümle giriniz=");
       String cumle= oku.nextLine();
        //if (cumle.contains("a")== true)
       // System.out.println("evet");
        //if (cumle.contains("a")==false)
       // System.out.println("hayır");

       // if (cumle.contains("A")== true)
            System.out.println("evet");
       // if (cumle.contains("A")== false)
          //  System.out.println("hayır");

        cumle=cumle.toLowerCase(); //bütün büyük harfler küçük oldu

        if (cumle.contains("a"))
            System.out.println("VAR");
        if (!cumle.contains("a"))
            System.out.println("YOK");









    }
}
