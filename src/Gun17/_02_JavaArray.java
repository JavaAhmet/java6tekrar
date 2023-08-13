package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // Bu gun hava cok guzel -> 5

        Scanner scanner= new Scanner(System.in);
        System.out.println("sentence=");
        String sentence= scanner.nextLine();

        int boslukSayisi=0;
        for (int i = 0; i <sentence.length() ; i++) {
            if (sentence.charAt(i)==' ')
                boslukSayisi++;
        }
        System.out.println("kelime sayısı = " + (boslukSayisi+1));



    }
}
