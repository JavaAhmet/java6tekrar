package Gun38._02_Abstract;

public class GeometriMain {
    public static void main(String[] args) {

        Dikdörtgen d=new Dikdörtgen(4,5);
        d.setName("Yeni Dikdöretgen"+" ");
        d.ciz();
        System.out.println("d = " + d);
        System.out.println("------------------");
        Daire dr=new Daire(5);
        dr.setName("Yeni Daire Çiz"+" ");
        dr.ciz();
        System.out.println("dr = " + dr);
    }
}
