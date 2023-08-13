package Gun25._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);
        ArrayList<Ogrenci>ogrenciler=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr=new Ogrenci();

            System.out.println("öğrenci adı=");
            ogr.adi=scanStr.nextLine();
            System.out.println("öğrencinin soyadı=");
            ogr.soyadi=scanStr.nextLine();
            System.out.println("öğrenci sınıfı=");
            ogr.sinifi= scanInt.nextInt();
            System.out.println("öğrenci adresi=");
            ogr.adres=scanStr.nextLine();

            ogrenciler.add(ogr);
        }
        for (Ogrenci o : ogrenciler){
            System.out.println("o.adi = " + o.adi);
            System.out.println("o.soyadi = " + o.soyadi);
            System.out.println("o.sinifi = " + o.sinifi);
            System.out.println("o.adres = " + o.adres);
        }

    }
}
