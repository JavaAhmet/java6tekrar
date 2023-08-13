package Gun09;

import java.util.Scanner;

public class _06_StringIf {
    public static void main(String[] args) {
        // girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız
        Scanner oku= new Scanner(System.in);
        System.out.println("CUMLE GİRİNİZ=");
        String cumle= oku.nextLine();
         boolean varMi =cumle.contains("a"); // a varsa true, yok ise false
            System.out.println("EVET");
        if (varMi == true)
            System.out.println("EVET");
        if (varMi == false)
            System.out.println("HAYIR");

        // 2. yol
        if( cumle.contains("a")== true)
        System.out.println("EVET");
        if (cumle.contains("a")==false)
            System.out.println("HAYIR");
        // Alternatif
        cumle.contains("a"); // a içeriyor mu
        cumle.indexOf("a"); // a içeriyorsa index ini verir (0-....)
                            // a içermiyor ise -1 verir

        if (cumle.indexOf("a")>=0)  // !=-1
            System.out.println("EVET");

        if (cumle.indexOf("a")==-1)  // <0
            System.out.println("HAYIR");



    }
}
