package Gun44;

public class Soru59 {
    public static void main(String[] args) {
        // Given the code fragment?
        int[] intArr={8,16,32,64,128};

        // Whic two code fragments independently print each element in this array?(Choose two)

        for (int i: intArr){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < intArr.length; i++) {
            System.out.print( intArr[i]+" ");
        }
    }
}
