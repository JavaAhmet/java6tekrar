package Gun28._02_Ornek;

public class Booker {
    public static void main(String[] args) {
        Book kit1=new Book();

        kit1.name="Harry Poter";
        kit1.publishYear=1997;
        kit1.author="JK Rowling";
        //System.out.println("kit1.toString() = " + kit1.toString());


       Book kit2=new Book("yüzüklerin efendisi",1954,"JRR Tolkien");
       Book kit3=new Book("üzüm ve çay",2023);

        System.out.println("kit1 = " + kit1);
        System.out.println("kit2 = " + kit2);
        System.out.println("kit3 = " + kit3);


    }
}
