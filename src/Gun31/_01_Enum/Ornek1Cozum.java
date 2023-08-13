package Gun31._01_Enum;
enum  Aylar{

    // numara ve simge eşleştirmesi lazım // baştaki ENUM DEĞİŞKEN TİPİ GİBİ DAVRANIYOR CLASS ASLINDA CLASS GİBİ
    Tanımsiz,OCAK,ŞUBAT,MART,NISAN,MAYIS,HAZIRAN,
    TEMMUZ,AGUSTOS,EYLUL,EKIM,KASIM,ARALIK
    // YUKARDA ENUM CLASSI AÇ SİMGELERİ YAZ. SİMGE GİBİ GÖRÜR
}
// enu clasın içindede tanımlanır ama metotlarda tanımlanmaz
public class Ornek1Cozum {
    // enumaration : numaralandırılmış simgeler
    public static void main(String[] args) {
        int sayi=5;
        Aylar ay = Aylar.MAYIS;   // -> AYLAR TİPİNDE BİR AYDIR DİYOR VE ENUMUN TANIMLADĞI AYLAR ÇIKIYOR
        switch (ay) {
            case ŞUBAT: System.out.println(28);break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println(31);break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL: System.out.println(30);break;
        }

        if (ay==Aylar.MAYIS)
            System.out.println("Zam ayı");
        System.out.println("ay = " + ay); // toString SIMGE
        System.out.println("ay.name() = " + ay.name()); // name de hangi ayı istersen o ayı alır simge karşılığı
        System.out.println("ay.ordinal() = " + ay.ordinal()); // ordinal simglerin sırasını indexini verir
        // bunlar for each de yazdırılır
        for (Aylar a:Aylar.values())
            System.out.println(a.name()+"- "+a.ordinal());


    }
}
