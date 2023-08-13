package Gun30._01StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {
        Student ogr1=new Student(1,"ismet temur");
        Student ogr2=new Student(2,"mehmet yılmaz");
        Student ogr3=new Student(3,"Beyza Demir");
        // problem: hem id yi takip etmek zorundayım
        // hem de hata olasılığı yüksek

        Student ogr10=new Student("ismet");
        Student ogr11=new Student("ismet");
        Student ogr12=new Student("ismet");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);
    }
}
