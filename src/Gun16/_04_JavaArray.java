package Gun16;

public class _04_JavaArray {
    public static void main(String[] args) {
        int[] array=new int[5];// 0,1,2,3,4 indexli 5 elemanlı dizi,int sayi
        int[]array2={3,6,44,55,77};// 5 elemanlı dizi, hem tanımlandı hem de değer atandı,int sayi=5
        String[]sentences=new String[5];// 5 tane sentence can hide a String array changeable
        boolean[]array3=new boolean[5]; // 5 taqne (true/false) saklayabilen bir array changeable
        double[] proportions=new double[5]; // 5 tane double can hide  ARRAY VARİABLE

        for (int i = 0; i < array.length; i++) {
            System.out.println("array = " + array[i]);
        }
        for (int i = 0; i < sentences.length; i++) {
            System.out.println("sentences = " + sentences[i]);
        }
        for (int i = 0; i <array3.length ; i++) {
            System.out.println("boolean array = " + array3[i]);
        }
        for (int i = 0; i < proportions.length ; i++) {
            System.out.println("proportions = " + proportions[i]);
        }




    }
}
