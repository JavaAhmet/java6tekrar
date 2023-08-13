package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] array=new int[10]; // 10 tane değer boş halde, default 0
        int[] array2={2,3,45,67,8,8,99,0,44,2};// 10 tane hem tanımlandı hem değer atandı

        int [][] tablo=new int[2][3];// 2 satır 3 sütun hepsi default 0 değerine sahip
        int [][] tablo2= { {2,3,44},{44,66,5}}; // 2 satır 3 sutun.

        for (int satir = 0; satir < 2; satir++) { // 0,1 . satırlar
            System.out.println(tablo2[satir][0]);
            System.out.println(tablo2[satir][1]);
            System.out.println(tablo2[satir][2]);

        }
        for (int satir = 0; satir <2 ; satir++) {
            for (int sutun = 0; sutun <3 ; sutun++)
                System.out.print(tablo2[satir][sutun]+" ");

                System.out.println();


        }

    }
}
