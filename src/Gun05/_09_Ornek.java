package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // kulanıcıdan ağırlığınıd (kg) double, boyunu (m) double olarak alınız.
        // ve bir satırda  boyunuz ..... ve kilonuz ..... şeklinde yazdırınız.
        // vucut kitle indexini de bulrak yazdırınız kg/(boy*boy)

        Scanner oku= new Scanner(System.in);
        System.out.println("boy(m)=");
        double boy= oku.nextDouble();
        System.out.println("kilo(kg)=");
        double kilo= oku.nextDouble();
        double Index= kilo/(boy*boy);
        System.out.println("Kilonuz="+kilo+"kg, boyunuz="+boy+"m");
        System.out.println("Index = " + Index);

        

    }
}
