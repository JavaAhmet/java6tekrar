package Gun28._04_Ornek;

public class BDDK {
    public static void main(String[] args) {

        Banka bank1=new Banka();
        bank1.ad="Ziraat";
        bank1.kurulusYili=1880;
        bank1.SubeSayisi=1200;


        Banka bank2=new Banka("yapi kredi",200,1944);

        Banka bank3=new Banka("garanti",1992,0);
        Banka bank4=new Banka("vakıfbank");
        System.out.println("bank1 = " + bank1);
        System.out.println("bank2 = " + bank2);
        System.out.println("bank3 = " + bank3);
        System.out.println("bank4 = " + bank4);

    }
}