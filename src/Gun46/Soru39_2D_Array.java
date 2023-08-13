package Gun46;

public class Soru39_2D_Array {
    public static void main(String[] args) {
        //Given the code fragment:
        String shirts[][] =new String[2][2];
        shirts[0][0]="red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";
        for (String [] sh:shirts){
            for (String s:sh){
                System.out.print(s+":");
            }
        }

    }
}
