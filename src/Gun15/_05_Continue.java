package Gun15;

import sun.swing.StringUIClientPropertyKey;

import java.util.Scanner;

public class _05_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.
        Scanner scanner=new Scanner(System.in);
        System.out.println("please entry sentence =");
        String sentence= scanner.nextLine();
        // bu gün hava çok güzel-> index =0 , kaça kadar gider cumle.length, 1 er 1 er
        for (int i = 0; i <sentence.length(); i++) {

            if (sentence.charAt(i)==' ')
                continue;
            System.out.println(sentence.charAt(i));


        }

    }
}
