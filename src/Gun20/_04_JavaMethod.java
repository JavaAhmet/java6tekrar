package Gun20;

import Tools.MyFunc;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        // bir fonksiyonda buldurup mainden yazdırınız
        // Örn: 5 girildiyse -> 12345 i bulmalısınız
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayı gir=");
        int edge= scanner.nextInt();

        int carpim=faktoriyel(edge);
        System.out.println("carpim = " + carpim);
    }
    public static int faktoriyel (int sayi){

        int carpim=1;
        for (int i = 1; i <=sayi ; i++)
            carpim=carpim*i;
          return carpim;

    }
}
