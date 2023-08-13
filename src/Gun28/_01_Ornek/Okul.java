package Gun28._01_Ornek;

public class Okul {
    public static void main(String[] args) {
          Ogrenci ogr1 =new Ogrenci();
          // 1. yol

        ogr1.id=1;
        ogr1.ad="ismet";
        ogr1.soyad="temur";
        ogr1.sinif=6;
        System.out.println("ogr1.ad = " + ogr1.ad);

        // 2. yol
        Ogrenci ogr2=new Ogrenci(3,"mehmet","yılmaz",5);
        System.out.println("ogr2.ad = " + ogr2.ad);


        Ogrenci ogr3=new Ogrenci(3,"ayşe","demir");
        System.out.println("ogr3.ad = " + ogr3.ad);


    }
}
