package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class p2Kedi extends P1Hayvan {

    public p2Kedi(String ad,String cinsi)
    {
        this.ad=ad; // this yerine inheritance olduğu için super de olur
        this.cinsi=cinsi;// protected
    }


}
