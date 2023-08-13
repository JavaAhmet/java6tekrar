package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;// 2. adım
    int maxSaat;
    ArrayList<Lesson>dersleri=new ArrayList<>();

    public void dersYazdir(){
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayın,"+ name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lesson d:this.dersleri)
            System.out.println(d.name+"-"+d.saat);


    }
    public static void universiteKurallari()//6. adım
    {
        System.out.println("Kural 1:Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural 2:Uykunu mutlaka al, sağlık en önemlisi");
        System.out.println("Kural 3:Her zaman dinç ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4:En başta verdiğin sözü unutma, şu an kamptasın");
        System.out.println("Kural 5:İnşallah biz bu işi başaracağız");
        System.out.println("Kural 6:tekrarsız derse gelme");
        System.out.println("Kural 7:Kendi hatasını bulan kraldır");
    }
}
