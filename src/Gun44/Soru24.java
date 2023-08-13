package Gun44;

public class Soru24 {
    public static void main(String[] args) {
        // Given the for fragment
        String [] strs=new String[2];
       // strs[0]="";
       // strs[1]="";
        int idx=0;


        for (String s:strs){

            strs[idx].concat("element"+idx);
           // strs[idx]=strs[idx].concat("element"+idx);
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}
