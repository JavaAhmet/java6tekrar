package Gun29._03_Protected.Paketİki;

import Gun29._03_Protected.PaketBir.Doctor;

public class OzelHastane {
    public static void main(String[] args) {
        Doctor dok1=new Doctor("ayşe");
        dok1.hastaneAd="Özel İstanbul Hastanesi";

        //Doctor dok2=new Doctor();
        //default sadece kendi paketinden ulaşılabilir.
    }
}
