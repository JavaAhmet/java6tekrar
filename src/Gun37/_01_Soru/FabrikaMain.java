package Gun37._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        // 3 er tane nesne oluşturacaz
        TeslaCar tesla = new TeslaCar("model 5", 310);
        ToyotaPirus pirus = new ToyotaPirus("Sedan", 1200);
        Bus bus = new Bus("IVECO", 7000);
        // Arabalar.add deyince Vehicle cinsinden ekleniyor.polymorphism
        // referans tip vehicle
        ArrayList<Vehicle> arabalar = new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(pirus);
        arabalar.add(bus);
        // for ile arabaların içindekini döngü ile yazdıralım
        for (Vehicle v : arabalar) {
            //class ın adlarını yazdıralım.
            System.out.println("**************************");
            System.out.println(v.getClass().getSimpleName());
            System.out.println("**************************");

            System.out.println(v.getModel());// başlarına model engine başlıları yazıldı
            System.out.println(v.getEngine());

            if (v instanceof TeslaCar)
            {

                // ((TeslaCar) v).driver();
                // ((TeslaCar)v).changeBattery();
                //System.out.println("v = " + v);
                // System.out.println("v = " + v);
                // String döndürdüğü için sou içinde yazabiliriz
                System.out.println(((TeslaCar) v).driver());
                System.out.println(((TeslaCar) v).changeBattery());
            }
            else
                if (v instanceof ToyotaPirus)
                {
                System.out.println(((ToyotaPirus) v).driver());
                System.out.println(((ToyotaPirus) v).changeBattery());
                System.out.println(((ToyotaPirus) v).changeOil());
            }
            else
            {
                System.out.println(((Bus) v).driver());
                System.out.println(((Bus) v).changeDeisel());
            }

        }
    }
}
