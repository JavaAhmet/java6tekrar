package Gun24;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış
        int secim = 0;
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        Map<String, String> sozluk = new TreeMap<>();
        //KELİME MANASI

        do {

            System.out.println("MENÜ\n1-EKLEME\n2-DÜZELTME\n3-LİSTELEME\n4-ARAMA\n5-SİLME\n6-ÇIKIŞ\nSeciminiz=");
            secim = okuInt.nextInt();

            switch (secim) {

                case 1:
                    System.out.println("Kelime giriniz");
                    String kelime = okuStr.nextLine();
                    System.out.println("Anlamı");
                    String anlami = okuStr.nextLine();
                    sozluk.put(kelime, anlami);

                    break;
                case 2:
                    System.out.println("düzeltilecek kelime giriniz");
                    kelime = okuStr.nextLine();
                    System.out.println("Anlamı=");
                    anlami = okuStr.nextLine();
                    sozluk.put(kelime, anlami);

                    break;
                case 3:
                    System.out.println("sözlükteki kelimeler=");
                    for (Map.Entry<String, String> k : sozluk.entrySet())
                        System.out.println(k.getKey() + "-" + k.getValue());
                    break;
                case 4:
                    System.out.println("aranan kelime giriniz=");
                    kelime = okuStr.nextLine();
                    System.out.println(sozluk.get(kelime));
                    break;
                case 5:
                    System.out.println("silinecek kelime giriniz=");
                    kelime = okuStr.nextLine();
                    sozluk.remove(kelime);
                    break;
                case 6:
                    System.out.println("çıkış");
                    break;
                default:
                    System.out.println("hatalı giriş.");
            }
            // secim 1 ise ekle

        } while (secim < 6);//
    }
}
