package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //  dizi nasıl okunur and how is yazdırılır.
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10]; // 10 elemanlı bir array tanımlandı 0-9
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ".enter number=");
            array[i] = scanner.nextInt();// 0,1,2,3,4,5,
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]=" + array[i]);
        }

    }
}
