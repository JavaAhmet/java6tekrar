package Gun16;

import java.util.Scanner;

public class _06_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trtr, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.


        String[]channels={"ntv","atv","ötv","kdv","mtv"};
      int randomIndex=(int) (Math.random()* channels.length);// 5 kadar üretir 0,1,2,3,4
        System.out.println("random are elected channels = " +channels[ randomIndex]);

        // TO DO: GÜNÜN SORUSU: BİR DÖNGÜ İLE 5 TANE RASTGELE BULDURUNUZ
        // TO DO: FAKAT BİR BULDUĞUNU TAKRAR BULMALISIN






    }
}
