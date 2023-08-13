package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // girilen bir öğrenci notuna göre 50 den büyük-eşit
        // ise geçtiniz ,küçük ise kaldınız yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("not=");
        int ogrnot= oku.nextInt();

        if (ogrnot>=50)
            System.out.println("Geçtiniz");
        if (ogrnot<50)
            System.out.println("Kaldınız");

    }
}
