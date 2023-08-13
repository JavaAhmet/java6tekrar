package Gun45;

public class Soru16_2D_Arrays {
    public static void main(String[] args) {
        //Given the code fragment.

        String [][] arr={
                {"A","B","C"},
                {"D","E"}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("B")){
                    continue;  // sout olunca compilation fails olur
                }

            }
            continue;
        }

    }
}
