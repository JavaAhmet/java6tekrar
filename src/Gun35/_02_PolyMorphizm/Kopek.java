package Gun35._02_PolyMorphizm;

public class Kopek extends Hayvan{ // HAYVAN SINIFINDAN EXTENDS ETTİK
    public Kopek(String name) {
        super(name);
    }


    @Override
    public void ses() { // HAYVANDAKİ SES METHODUNU OVERRİDE YAPTIK
        //super.ses();  // SUPER SES ÇIKTI super.ses()
                        // onun yerine sou dan havladı yaptık
        System.out.println("havladı");
    }
    // BİRDE BUNUN KENDİNE ÖZEL KOKLADI OLSUN
    public  void kokladi(){
        System.out.println("kokladi");
    }
}
