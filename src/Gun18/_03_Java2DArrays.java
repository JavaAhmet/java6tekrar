package Gun18;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        int [][] tablo= {{2,3,44},{45,66,5}}; // 2 satır , 3 sütun new[2][3]

        System.out.println(Arrays.toString(tablo[0]));
        System.out.println("tablo[0].length="+tablo[0].length);
        System.out.println(Arrays.toString(tablo[1]));
        System.out.println("tablo[0].length="+tablo[1].length);
        System.out.println("tablo = " + tablo.length);
        for (int satir = 0; satir< tablo.length ; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                System.out.print(tablo[satir][sutun]+ " ");

                System.out.println();


        }



    }
}
