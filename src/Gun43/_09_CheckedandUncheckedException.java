package Gun43;

import Tools.MyFunc;

import static Tools.MyFunc.*;

public class _09_CheckedandUncheckedException {
    public static void main(String[] args) {
        String kelime="";
        char ilkHarf=kelime.charAt(0);


    }

    public static void bekle(int sn){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
