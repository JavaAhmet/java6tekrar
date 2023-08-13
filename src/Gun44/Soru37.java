package Gun44;

public class Soru37 {
    public static void main(String[] args) {
        //Given the following the code
        int [] intArr={15,30,45,60,75};
        intArr[2]=intArr[4];
        intArr[4]=90;

        // What are the values of each element in intArr after
        // this code has executed?

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+",");
        }

    }
}
