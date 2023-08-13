package Gun35._02_PolyMorphizm;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("karabaş");
        kopek1.ses();// havladi
        kopek1.kokladi();// kokladı

        Kedi kedi1 = new Kedi("tekir");
        kedi1.ses();// miyavladı
        kedi1.tirmaladi();// tırmaladı

        // ben kopekSesi şeklinde fonksiyon yazssam yada kediSesi
        // şeklinde

        kopekSesi(kopek1);// havladı
        kediSesi(kedi1); // miyavladı

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);

        //Setlerden HashSet
        //Maplardan HashMap
        //Listlerden ArrayList

        //Hayvanlardan Kedi
        // Hayvanlardan Köpek
        // Hayvanlardan hayvan
        // referansın tipi (kaynağın)  // nesnenin tipi
        Hayvan hayvan1=                new Hayvan("öredek");
        Hayvan hayvan2=               new Kopek("kangal");
        Hayvan hayvan3=               new Kedi("BONCUK");


        System.out.println("-------------------");
        hayvan1.ses(); // ses çıkardı
        hayvan2.ses(); // havladı
        hayvan3.ses(); // miyavladı
        System.out.println("--------------------");

        ((Kopek)hayvan2).kokladi();

        // Polymorphism=çok formluluk-çok çeşitlilik
        //şizofren bir konu
          //      : Bir nesne istenildiğinde ,aynı zamanda extend edildiği tür gibi davranmasına ve bu şekilde
           //     kullanılabilmesine Polymorphism denir
                // öğretmeni okulda fizik öğretmeni denmesi
      //  mahallede öğretmen denmesi gibi

    }

    public static void hayvanSesi(Hayvan hayvan) {
        hayvan.ses();

        if (hayvan instanceof Kopek)// HAYVAN KÖPEK İSE
            ((Kopek) hayvan).kokladi();
        if (hayvan instanceof Kedi)
            ((Kedi) hayvan).tirmaladi();
    }

    // buraya fonksiyonu gönderdim
    public static void kopekSesi(Kopek kopek) {
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi) {
        kedi.ses();
    }

}
