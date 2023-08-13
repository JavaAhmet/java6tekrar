package Gun15;

import java.util.Scanner;

public class _04_Continue {
    public static void main(String[] args) {
// kullanıcıdan  5 sayı isteyiniz .
        //bu sayılardan 6 ile 10 arasındakler hariç diğerlerini toplasın.ekrana yazsın
        Scanner scanner=new Scanner(System.in);
        int toplam=0;
        for (int i=1;i<=5;i++){
            System.out.println("sayı giriniz=");
            int sayi= scanner.nextInt();
            if (sayi>6 && sayi<10)// 7,8,9 girer
                continue; // pas geç: kendinden sonra gelen komutları pas geçer
            // döngünün sonraki adımına geçer

            toplam=toplam+sayi;
            System.out.println("continue çalışmadı");

        }

        System.out.println("toplam = " + toplam);

    }

}
