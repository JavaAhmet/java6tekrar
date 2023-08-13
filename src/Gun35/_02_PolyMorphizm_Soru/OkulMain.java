package Gun35._02_PolyMorphizm_Soru;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci("Ayşe","Yılmaz","Öğrenci","5A");
        Calisan cal=new Calisan("Ali","Demir","Tester","IT");

        Kisi.kimlikBelgesiYazdir(ogr);
        Kisi.kimlikBelgesiYazdir(cal);

    }
}
