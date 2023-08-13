package Gun44;

public class Soru29 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        // indexler 0,2,4 olmalı
        //  2 şer artacak indexler

        for (int e = 0; e < 5; e+=2) {
            System.out.print(" a = "+ a[e]+",");
        }

    }
}
