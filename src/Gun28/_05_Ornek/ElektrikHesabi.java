package Gun28._05_Ornek;

public class ElektrikHesabi {
    int totalconsumption=0;
    double unitPrice=20;
    public void ConsumptionAdd(int consumption) {
        totalconsumption = totalconsumption + consumption;
    }
        public void BillWrite(){
            double consumptionTL=totalconsumption*unitPrice;
            System.out.println("***********");
            System.out.println("   Faturanız");
            System.out.println("************");
            System.out.println("Total Consumption="+totalconsumption);
            System.out.println("Total price"+consumptionTL);
            System.out.println("*****************");

        }


}
