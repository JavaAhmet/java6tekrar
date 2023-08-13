package Gun45;

public class Soru46 {
    public static void main(String[] args) {
        // Given the code fragment
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;


        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
                idx++;
            }
        }

        catch (Exception e) {
            System.out.println("Invalid Name");
        }

        System.out.println();
        for (String s:pwd)
            System.out.println("s = " + s);

        // çıktı ne olur




    }
}
