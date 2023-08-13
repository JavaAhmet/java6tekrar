package Gun19;

public class _05_JavaMethod {
    public static void main(String[] args) {
        MerhabaYaz();
        MerhabaYaz();
        MerhabaYaz();
        MerhabaYazIsme("ahmet");
        cokMerhabaYaz(5);



    }



    public static void MerhabaYaz(){

        System.out.println("Merhaba Dünya");
    }

    public static void MerhabaYazIsme(String ad){

        System.out.println("ad = " + ad);
    }

    public static void cokMerhabaYaz(int miktar){
        for (int i = 0; i < miktar; i++)
            System.out.println("merhaba");
    }

}
