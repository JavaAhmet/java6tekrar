package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_JavaTryMultipleCatch {
    public static void main(String[] args) {

        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("1. sayı giriniz=");
            int sayi1= scanner.nextInt();
            System.out.println("2.Sayı girinzi=");
            int sayi2= scanner.nextInt();

            int bolum;
            bolum=sayi1/sayi2;
            System.out.println("bolme = " + bolum);

            // String kelime=""; // genel hataya düşmesi için yapıldı
            // kelime.charAt(3);
        }
        catch (ArithmeticException ex) // belirli bir hata :case
        {
            System.out.println("Sıfıra bölme hatası oluştu");

        }
        catch (InputMismatchException ex) // belirli bir hata: case
        {
            System.out.println("Sayı giriniz");
        }
        catch (Exception ex) // genel hata switch deki default gibi
        {
            System.out.println("Beklenmeyen Hata oluştu");
        }

        System.out.println("Program bitti");






    }
}
