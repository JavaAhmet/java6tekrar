package Gun07;

public class _08_StringStarsWith {
    public static void main(String[] args) {



    // StarsWith: bununla başlıyor mu?
    // sonuç true veya false
        String text="HCL Teknoloji"; // LeasePlan
        System.out.println("textstarsWith(HC) = " + text.startsWith("HC")); //true
        System.out.println("textstarsWith(te) = " + text.startsWith("te")); //false
        System.out.println("textstarsWith(h) = " + text.startsWith("h")); //false
        System.out.println("textstarsWith(H) = " + text.startsWith("H")); //true


    }

}
