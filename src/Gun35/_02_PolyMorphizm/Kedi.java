package Gun35._02_PolyMorphizm;

public class Kedi extends Hayvan {
    public Kedi(String name) {
        super(name);
    }

    @Override  // SESİ OVERRİDE DAN GETİRDİK
    public void ses() {
        System.out.println("miyavladi");
    }
    public void tirmaladi() {
        System.out.println("tirmaladi");
    }
}
