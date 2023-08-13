package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan
        // Random atayarak doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1,
        // çift olanlara 0 atayınız  yazdırınız.

             int [] array=new int[50];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 10);

            for (i = 0; i < array.length; i++)
                System.out.println("dizi önce= " + array[i]);


            for (i = 0; i < array.length; i++) {
                if (array[i]%2 == 0)  // çiftse
                    array[i]=0;
                else
                    array[i]=1;
            }
            for (i = 0;  i<array.length ;i ++) {
                System.out.println("array later (sonra) = " + array[i]);

            }




        }


    }
}
