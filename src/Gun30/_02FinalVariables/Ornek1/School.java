package Gun30._02FinalVariables.Ornek1;

import Gun30._01StaticVariables.Ornek2.Student;

public class School {
    public static void main(String[] args) {
        Gun30._01StaticVariables.Ornek2.Student ogr1=new Gun30._01StaticVariables.Ornek2.Student(1,"ismet temur");
        Gun30._01StaticVariables.Ornek2.Student ogr2=new Gun30._01StaticVariables.Ornek2.Student(2,"mehmet yılmaz");
        Gun30._01StaticVariables.Ornek2.Student ogr3=new Gun30._01StaticVariables.Ornek2.Student(3,"Beyza Demir");
        // problem: hem id yi takip etmek zorundayım
        // hem de hata olasılığı yüksek

        Gun30._01StaticVariables.Ornek2.Student ogr10=new Gun30._01StaticVariables.Ornek2.Student("ismet");
        Gun30._01StaticVariables.Ornek2.Student ogr11=new Gun30._01StaticVariables.Ornek2.Student("ismet");
        Gun30._01StaticVariables.Ornek2.Student ogr12=new Student("ismet");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);

        // ogr10.id=5005;
        // Student.sayac=5005;
        // ogr10.id=5005;
        // final değişkenlerine sadece 1 kez veri atanabilir
        // o da ya tanımlanırken, ya da Constructor da
    }
}
