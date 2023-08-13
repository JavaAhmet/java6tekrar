package Gun47;

import java.util.ArrayList;

public class Soru155_2D_Arrays {
    public static void main(String[] args) {
        ArrayList<Integer>points=new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(1);
        points.remove(null);
        System.out.println(points);
        // points.remove((Object)1);  DEĞERİ SİLER İNDEXİ DEĞİL
        // String ,Integer ,Double,Long NULL ALABİLİYOR
        // int ,double,float,long -> default 0

    }
}
