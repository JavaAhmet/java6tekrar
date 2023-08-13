package Gun36._05_Interface;

import Gun36._04_Interface.IGosterir;

public class Test implements IGosterir,IYazdirir {
    @Override
    public void goster() {
        System.out.println("gösterdi");
    }

    @Override
    public void yazdir(String msg) {
        System.out.println(msg + " yazdırıldı");
    }

    @Override
    public void yaz() {
        System.out.println("yazdırıldı");
    }

    @Override
    public int yazdirmaSayisiGoster() {
        int sayfaSayisi=5; // metod çalıştı
        return sayfaSayisi;
    }
}
