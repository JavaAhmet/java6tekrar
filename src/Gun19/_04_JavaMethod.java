package Gun19;

public class _04_JavaMethod {
    // metotların yazılabileceği yer


    public static void main(String[] args) {// ana method diğer metotlardan buranın içine çağrılacak
       int enb= Math.max(5,6); //max metodu değerler almış geriye büyük olanı vermiş.
        double rndsayi=Math.random();// hiç birşey almıyor, sadece veriyor.
        System.out.println("Merhaba Dünya");// veri alıyor götürüp ekrana yazıyor
        System.out.println("Merhaba Dünya");// veri alıyor götürüp ekrana yazıyor
        System.out.println("Merhaba Dünya");// veri alıyor götürüp ekrana yazıyor

        merhabaYaz(); // kullanımı olay çağırması kolay tekrar tekrar kullanabilirsin
        merhabaYaz(); // main daha kolay anlaşılabilir oluyor. temiz kod
        merhabaYaz(); // fonksiyonu çağırma şekli



    }

    // methodların yazılacağı yer
    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya: Methoddan");

    }
}
