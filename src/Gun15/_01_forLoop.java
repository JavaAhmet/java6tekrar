package Gun15;

public class _01_forLoop {
    public static void main(String[] args) {
        //  0 dan 100 e kadar olan çift sayıların toplamını bulunuz
        // toplam 50 yi geçtiğinde ,mesaj yazınız (50 geçildi)
        // başlangıç 0, sonu belli=100 artış 2 şer :for döngüsü
        int i=0;
        int total=0;

        for (i=0; i<=100;i=i+2) {
            total = total + i;
            System.out.println("i = " + i);
            if (total > 50)
                System.out.println("50 geçldi");
            break; //  döngüyü kır sonlandır döngüden sonraki adıma geç

        }
    }
}
