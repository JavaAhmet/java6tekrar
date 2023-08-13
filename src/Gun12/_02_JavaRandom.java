package Gun12;

import java.util.Scanner;

public class _02_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.
        // 5 girersem 5 e kadar sayi ürettsin ,ben tahmin etmeye çalışayım.
        Scanner read=new Scanner(System.in);
        System.out.println("entry number edge=");
        int edgesinir= read.nextInt();
        int holdnumber=(int)(Math.random()*edgesinir); // 6 -> 0,1,2,3,4,5
        System.out.println("holdnumber = " + holdnumber);
        System.out.println("predict=");
        int predict=read.nextInt();
        if (holdnumber== predict)
            System.out.println("APPRECİATE");
        else
            System.out.println("not know" +holdnumber);




    }
}
