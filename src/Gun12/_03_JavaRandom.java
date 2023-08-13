package Gun12;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {
        // (int) ( Math.Random()*10) -> 0-9 arası üretir,0-20 0-100

        // 20-30 arası ramdom sayı nasıl üretiriz. şimdi bunu öğrenecez.
        // bunun için birede min-alt sınır ve max üst sınır lazım

        //Girilen min ve max aralığında random sayı üreten programı yazınız.
        Scanner read= new Scanner(System.in);
        System.out.println("min(alt sinir)=");
        int min= read.nextInt();
        System.out.println("max(üst sinir)=");
        int max= read.nextInt();

        int randomsayi=(int) (Math.random()*(max-min))+min;
        System.out.println("randomsayi = " + randomsayi);

    }
}
