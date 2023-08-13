package Gun27._01_Ornek;

public class Utility { // utulity sınıfın tipin adı
    public  String getString(int sayi) {
        return String.valueOf(sayi);
        // string e çevir

    }
   // eğer bir metod nesnenin özelliklerini
    // kullanıyorsa nesne oluşturulmadan
    // kullanılamaz.Dolayısıyla STATİC olamaz
    // nesne şart


    public static String getString2(int sayi){

        return String.valueOf(sayi);
    //string e çevir ver

    }
}
