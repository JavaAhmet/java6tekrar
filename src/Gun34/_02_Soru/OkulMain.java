package Gun34._02_Soru;

public class OkulMain {
    public static void main(String[] args) {
        LiseOgrencisi logr1=new LiseOgrencisi("AHMET","say");
        LiseOgrencisi logr2=new LiseOgrencisi("ali","SÖZ");
        IlkOgrencisi iogr=new IlkOgrencisi("ayşe","müzik");

        System.out.println("logr1 = " + logr1);
        System.out.println("logr2 = " + logr2);
        System.out.println("iogr = " + iogr);
    }
}
