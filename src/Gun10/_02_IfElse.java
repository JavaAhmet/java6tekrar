package Gun10;



import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazınız
        Scanner read=new Scanner(System.in);
        System.out.print("Count entry=");
        int count= read.nextInt();
       // int bolmekalan=(count/2);
       // if (bolmekalan==1)
         //   System.out.println("tek");
      //  if (bolmekalan!=1)
        //System.out.println("çift");
        int remainder = count%2; // çiftler 0,2 (-2,-4) tekler 1,3,5 veya -1 (-1,-2,-3)
        if (remainder==0)
        System.out.println("çift");
      else // if (remainder!=0)  e
        System.out.println("tek");

      //diğer yol:
        Scanner read2= new Scanner(System.in);
        System.out.println("Count");
        int count1= read2.nextInt();
        int remainder2=count1%2;
        if (remainder2==1 || remainder2==-1) //-1 yada 1 whle
            System.out.println("tek");
            else // 0
        System.out.println("çift");









    }
}
