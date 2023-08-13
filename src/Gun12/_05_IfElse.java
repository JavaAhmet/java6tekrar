package Gun12;
import java.util.Scanner;
public class _05_IfElse {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // <  40 için F yazdırınız.
        Scanner read2 = new Scanner(System.in);
        System.out.print("Dersi ve Notunu giriniz=");
        String dersVeNot = read2.nextLine(); // Fizik:90
        // 1. yöntem substring
        int ind = dersVeNot.indexOf(":");
        int ogrNot = Integer.parseInt(dersVeNot.substring(ind + 1)); //90
        System.out.println("ogrNot = " + ogrNot);
        //2.yöntem regex // 0 ile 9 un dışındakileri (^) sil
        ogrNot = Integer.parseInt(dersVeNot.replaceAll("[^0-9]", ""));
        System.out.println("ogrNot2 = " + ogrNot);
        // else if görünüm
        if (ogrNot >= 90)
            System.out.println("A");
        else if (ogrNot >= 80)
            System.out.println("B");
        else if (ogrNot >= 70)
            System.out.println("C");
        else if (ogrNot >= 60)
            System.out.println("D");
        else if (ogrNot >= 40)
            System.out.println("E");
        else
            System.out.println("F");


    }

}
