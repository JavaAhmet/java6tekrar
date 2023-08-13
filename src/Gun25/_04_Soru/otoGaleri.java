package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class otoGaleri {
    public static void main(String[] args) {
        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);

        ArrayList<araba> galeri=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            araba a=new araba();

            System.out.println("Araba no=");
            a.arabaNo =scanInt.nextInt();
            System.out.println("Araba Markası=");
            a.marka=scanStr.nextLine();
            System.out.println("model=");
            a.model=scanInt.nextInt();
            galeri.add(a);
        }
        arabalarYazdir(galeri);
        //üretimOrtalamasiYazdir(galeri);
    }
    public static void arabalarYazdir(ArrayList<araba>galeri){
        for (araba a:galeri)
            System.out.println("a = " + a.arabaNo+" "+a.marka+" "+a.model);

    }
}
