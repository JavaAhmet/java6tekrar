package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c = new Cember();
        c.ciz(); // çember çizildi

        Dikdortgen d = new Dikdortgen();
        d.ciz(); // dikdörtgen çizildi


        //REFERANS-DAYANAK - NESNE
        ICizdirir c2 = new Cember();
        c2.ciz(); // çember çizildi
        // interface lerden nesne üretilemez fakat referans
        // tipi oluşturulabilir.Bu bize PolyMorphism sağladı.
        // direk olarak c2.ciz() Interfacedeki ismi verilmiş olanlar erişebilir.


        cizdir(c); // çember çizildi

        cizdir(d); // dikdörtgen çizildi
    }



    public static void cizdir(ICizdirir g)
        {
            g.ciz();

        }

}
