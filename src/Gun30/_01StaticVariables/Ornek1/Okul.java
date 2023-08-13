package Gun30._01StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {


   // Ogrenci ogr1=new Ogrenci("ismet","Temur","Yıldırım ilkokulu");
    //Ogrenci ogr2=new Ogrenci("Serkan","Şengül","Yıldırım ilkokulu");
   // Ogrenci ogr3=new Ogrenci("Elif","Özen","Yıldırım ilkokulu");
   // Ogrenci ogr4=new Ogrenci("ismet","temur","Yıldırım ilkokulu");


    //.....
    //.....

   // Ogrenci ogr499=new Ogrenci("Şenol","Doğan","Yıldırım ilkokulu");
    //Ogrenci ogr500=new Ogrenci("Murat ","Savluk","Yıldırım ilkokulu");

        Ogrenci ogr1=new Ogrenci("ismet ","temur");
        System.out.println("ogr1 = " + ogr1);


        Ogrenci.okulad="Atatürk ilkokulu";
        System.out.println("ogr1.tekrar = " + ogr1);

        // statik değişkenlerde en son verilen değer yazılır
        // Aynı verinin çok kez girişi engellendi
    // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi
}
}