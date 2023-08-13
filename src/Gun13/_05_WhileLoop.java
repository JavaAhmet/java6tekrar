package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // girilen 5 sayının toplam sonucunu yazdırınız
        Scanner read=new Scanner(System.in);
        int calculator=1;
       int total=0;
        while (calculator<=5);
        {
            System.out.println("calculator = " + calculator);
            int number= read.nextInt();
            total=total+number;

             calculator=calculator+1;
        }

    }
}
