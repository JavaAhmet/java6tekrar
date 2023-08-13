package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // Bir dikdörtgenin gerekli kenar (int) uzunluklarını kullanıcıdan isteyip
        // alanını ve çevresini bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan= a*b

        Scanner oku=new Scanner(System.in);
        System.out.println("kısaKenar");
        int kısakenar= oku.nextInt();
        System.out.println("uzunKenar");
        int uzunkenar= oku.nextInt();

        int cevre= kısakenar+kısakenar+uzunkenar+uzunkenar;
        int alan= kısakenar*uzunkenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

        System.out.println("bitti");
    };
}
