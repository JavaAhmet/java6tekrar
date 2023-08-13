package Gun17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {
    public static void main(String[] args) {

      //  iklimler çok  değişti

      //  String[] kelimeler=cumle.split(" ");

      //  kelimeler[0] -> "iklimler"
       // kelimeler[1] -> "çok"
        //kelimeler[2] -> "değişti"

      //  kelime.length -> 3
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // Bu gun hava cok guzel -> 5

        Scanner scanner=new Scanner(System.in);
        System.out.println("sentence=");
        String sentence= scanner.nextLine();
        String []words=sentence.split(" ");
        System.out.println("words = " + words.length);

    }
}
