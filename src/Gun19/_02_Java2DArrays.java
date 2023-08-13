package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int [][] tablo=new int[2][3];
        int [][] tablo2= {// 5 satır 4 sütun}
                {4, 55},// 0. satır 2 sütun
                {55, 44, 65},//1. satır 3 sütun
                {4, 6, 56, 54,67,21,4},// 2. satır 7 sütun
                {54,45},//3. satır 2 sütun
                {5}// 4. satır 1 sütun
        };

        for (int i = 0; i < tablo2.length ; i++) {//  satır sayısı
            for (int j = 0; j < tablo2[i].length; j++) // sütun sayısı hangi sütunsa onun length ini al

                System.out.print(tablo2[i][j]+" ");
                System.out.println();

        }



    }
}
