package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String>renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue"); // TEKRAR EKLEMEİYOR hashSet
        renkler.add("RED");
        System.out.println("renkler = " + renkler);

        for (String eleman:renkler){ // gönderdiği elemanların sırası garanti değil rasthgele gönderir.
            System.out.println("eleman = " + eleman);

        }
        // foreach
        int [] dizi={34,5,6,7,8,89,899,77};
        for (int eleman:dizi)
            System.out.println("eleman = " + eleman);


       // Integer[] lis={34,6,5,789,65,};
       // ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(dizi));

        Iterator gosterge=renkler.iterator();
        while (gosterge.hasNext()) // sırada eleman var ise
        {
            System.out.println("gosterge.next() = " + gosterge.next());
            // .Next göstergenin gösterdiği elemanı temsil ediyor

        }
    }
}
