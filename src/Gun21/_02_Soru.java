package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız sayılarla dolduracağınız 6 elemanlı(sayı) bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(liste)(ArrayList) atayarak
        // yazdırınız.
        Scanner scanner=new Scanner(System.in);
        int [] array=new int[6];



        for (int i = 0; i < array.length; i++) {
            System.out.println("sayi gir=");
            array[i]= scanner.nextInt();

            System.out.println("array = " + Arrays.toString(array));
        }

        ArrayList<Integer> tekler=new ArrayList<>();
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 != 0)
                tekler.add(array[i]);
        }
        System.out.println("tekler = " + tekler);

        /*************************************************************/
        //2. yöntem
        tekler.clear();
        for (int i = 0; i < array.length ; i++) {
            System.out.println("sayı giriniz=");
            array[i]= scanner.nextInt();
            if (array[i]%2 !=0)
                tekler.add(array[i]);
        }
        System.out.println("tekler = " + tekler);
    }
}
