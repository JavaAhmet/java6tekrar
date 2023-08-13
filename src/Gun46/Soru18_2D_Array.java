package Gun46;

public class Soru18_2D_Array {
    public static void main(String[] args) {
        String [][] chs= new String[5][2];
        chs[0]=new String[2];
        chs [1]=new String[5];
        int i=97;

        for (int j = 0; j < chs.length; j++) {
            for (int k = 0; k < chs.length; k++) {
                chs[j][k]=" "+i;
                i++;
            }
        }

        for (String[] ca:chs){
          for (String c:ca){
              System.out.println(c+" ");
            }
            System.out.println();
        }

        //runtime error
    }
}
