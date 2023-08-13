package Gun15;

import java.util.Scanner;

public class _02_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // bölüm:2 carpimin degeri 10000 ü geçtiğinde işlem sonlansın.
        Scanner scanner=new Scanner(System.in);
        System.out.print("sayı gir=");
        int edge= scanner.nextInt();
        int power=1;
        for (int i = 1; i<=edge ; i++) {
            System.out.print("power="+power+"*"+i);
            power = power * i;
            System.out.println("->" + i);
            if (power > 10000) {
                System.out.println("break çalıştı");
                break;
            }
        }













    }
}
