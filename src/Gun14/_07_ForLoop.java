package Gun14;

public class _07_ForLoop {
    public static void main(String[] args) {
        //  0 dan 100 e kadar olan çift sayıların toplamını bulunuz
        // toplam 50 yi geçtiğinde ,mesaj yazınız (50 geçildi)
        // başlangıç 0, sonu belli=100 artış 2 şer :for döngüsü
        int i=0;
        int total=0;
        boolean edgeexcessive=false;
        for (i=0; i<=100;i=i+2) {
            total = total + i;
            System.out.println("i = " + i);
            if (total > 50 && edgeexcessive==false)
                System.out.println("50 geçldi");
            edgeexcessive=true;
        }

        System.out.println("total = " + total);
    }
}


