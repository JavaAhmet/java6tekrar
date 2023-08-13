package Gun11;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // yana yana aralarında bir boşulkla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz

        Scanner read=new Scanner(System.in);
        System.out.println("please entry number blank=");//56 879
        String numbers= read.nextLine();
        int blankIndex=numbers.indexOf(" ");
        String strNumber1=numbers.substring(0,blankIndex); //56 sayı görünümlü string
        String strNumber2=numbers.substring(blankIndex+1); // 879 sayı görünümlü string
        int no1=Integer.parseInt(strNumber1);
        int no2=Integer.parseInt(strNumber2);

        if (no1==no2)
            System.out.println("equal");

        else
            System.out.println("non equal");


    }
}
