package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse
        // hayır yazdırınız.
        Scanner read=new Scanner(System.in);
        System.out.print("String entry:");
        String sentence= read.nextLine();
       // int Long = sentence.length();
       // System.out.println("sentence = " + sentence);
       // boolean isthere=sentence.contains("study");
        //if (isthere 'study' && sentence.length(
         //   System.out.println("evet");

        //EĞER CÜMLE 10 KARAKTERDEN BÜYÜKSE VE STUDY İÇERİYORSA EVET YAZ
        // DEĞİLSE HAYIR YAZ
        if (sentence.length() >10 && sentence.toLowerCase().contains("study"))
            System.out.println("YES");
        else
            System.out.println("NO");





    }
}
