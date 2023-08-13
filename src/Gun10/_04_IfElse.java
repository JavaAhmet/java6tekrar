package Gun10;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {
        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi şeklinde yazdırınız
        Scanner read=new Scanner(System.in);
        System.out.println("Number entry=");
        int count= read.nextInt();
        int remainder=count%2;
        if (remainder==1 || remainder>0)
            System.out.println("eligible count was entry");
        else
            System.out.println("dont eligible count was entry");
        //hocanın yolu
        if (count>0 && count%2==1)
            System.out.println("eligible did count entry");
        else
            System.out.println("dont eligible did count entry");


    }
}
