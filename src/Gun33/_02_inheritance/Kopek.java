package Gun33._02_inheritance;

public class Kopek extends Hayvan {

    public Kopek(String renk, int kilo, String cinsi)
    {
        super(renk, kilo, cinsi);
        // super miras alınan sınıf
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("havladı");
    }
}
