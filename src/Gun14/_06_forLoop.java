package Gun14;

import java.util.Scanner;

public class _06_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.
        Scanner read=new Scanner(System.in);
        System.out.println("sinir sayisi=");
        int sinir= read.nextInt();

    // başlangıcı=1,sonu:sinir 1 er
        int toplam=0;
        int i=1;
        for ( i=1;i<=sinir;i++)
        toplam=toplam+i;
        System.out.println("toplam = " + toplam);



    }
}
