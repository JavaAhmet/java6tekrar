package Gun28._05_Ornek;

public class EnerjiSa {
    public static void main(String[] args) {
        Musteri mus1 = new Musteri("ahmet");
        mus1.elektrikHesabi.ConsumptionAdd(50);
        mus1.elektrikHesabi.ConsumptionAdd(60);
        mus1.elektrikHesabi.ConsumptionAdd(70);
        System.out.println("mus1.elektrikHesabi.totalconsumption = " +
                            mus1.elektrikHesabi.totalconsumption);

        mus1.elektrikHesabi.BillWrite();
    }
}
