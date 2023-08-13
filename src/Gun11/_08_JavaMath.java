package Gun11;

import java.util.Scanner;

public class _08_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz.
        Scanner read=new Scanner(System.in);
        System.out.println("a value=");
        int a= read.nextInt();
        System.out.println("b value=");
        int b= read.nextInt();
        System.out.println("c value=");
        int c= read.nextInt();

        int biggerAB=Math.max(a,b);
        int morebigger=Math.max(biggerAB,c);
        System.out.println("morebigger = " + morebigger);

        // 2th way
        System.out.println(Math.max(Math.max(a,b),c ) );



    }



}
