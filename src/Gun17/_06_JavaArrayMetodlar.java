package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {
        String [] isimler={"Ahmet","Zeynep ","Roman ","Kaya","Cihan"};
        // diziyi direk ekrana yazdırmak için
        System.out.println("isimler = " + isimler);
        System.out.println("isimler = " + Arrays.toString(isimler) );
        int [] a={1,8,3,54};
        System.out.println("a = " +Arrays.toString(a));

        // dizi sıralama
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));

        // diziler eşit mi
        int[] b={1,8,3,54};
        int[] c={1,3,8,54};
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); //true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // false

        // contains gibi çalışır ,var ise pozitif sayı verir ,yok ise negatif
        System.out.println("Arrays.binarySearch(a,3) = " + Arrays.binarySearch(a, 3));
        System.out.println("Arrays.binarySearch(c,3) = " + Arrays.binarySearch(c, 3));

        //diziyi hızlıca doldurmakbir değer ile
        Arrays.fill(a,5);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));



}
}
