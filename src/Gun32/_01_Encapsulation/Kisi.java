package Gun32._01_Encapsulation;

public class Kisi {
   private String ad;
    private String soyad;
   private int yas;

    public void yasAta(int yas) // method yaptık
    {
        if(yas<0)
            System.out.println("Hatalı giriş");
        else
            this.yas=yas;  // kendi yaşına yaş
        //atamsı yaptık
    }

    public  void  setAd(String ad){

        if (ad.length()<25)
            this.ad=ad;
        else
            System.out.println("hatalı giriş");
    }

    public void setSoyad(String soyad)
    {
        if (soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("hatalı giriş");
    }
    public int yasVer(){
        return this.yas;
    }

    public String getSoyad(){

        return this.soyad;
    }
    public String getAd(){
        return this.ad;
    }
}
