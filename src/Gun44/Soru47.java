package Gun44;

public class Soru47 {
    public static void main(String[] args) {
        // Given the code fragment
        String[] strs={"A","B"};
        int idx=0;
        for (String s:strs){
        strs[idx].concat("elemnt"+idx);
        }
        for (idx = 0; idx <strs.length ; idx++) {
            System.out.print(strs[idx]);
        }
        // What is the result?

    }
}
