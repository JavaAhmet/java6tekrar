package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
       ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        ArrayList<  ArrayList<Integer>   > notlarListesi=new ArrayList<>(); // Listlerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 50 70 80
        // Fizik : 30 40
        // Kimya : 60 70 80 90

        ArrayList<String>dersler=new ArrayList<>();
        dersler.add("matematik");
        dersler.add("fizik");
        dersler.add("kimya");
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println( dersler.get(i) +":");
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j)+"\t");

            }
            System.out.println();
        }
        // Soru 2:
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        System.out.println("*************2.Soru***********");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ders no(0-Mat,1-Fiz,2-Kim)=");
        int dersNo= scanner.nextInt();

        dersNotlariniYazdir(dersNo,notlarListesi);



    }
    public static void dersNotlariniYazdir(int dersNo, ArrayList<  ArrayList<Integer> >notlarListesi){

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.print(notlarListesi.get(dersNo).get(i)+"\t");
        }

        // TODO
        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.

        int[]sayi=new int[5];

    }
}
