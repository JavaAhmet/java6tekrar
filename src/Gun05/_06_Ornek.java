package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Bir kenarını kullanıcıdan isteyip çevrisini ve alanını bulunuz ve yazdırınız.
        // cevre= a+a+a+a    alan=a*a

        Scanner oku= new Scanner(System.in);
        System.out.println("kenar=");
        int kenar= oku.nextInt();

        int cevre=kenar+kenar+kenar+kenar;
        int alan=kenar*kenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);



    }
}
