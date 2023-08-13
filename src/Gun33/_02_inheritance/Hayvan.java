package Gun33._02_inheritance;

public class Hayvan {
    private String renk;
    private int kilo;
    private String cinsi;



    public Hayvan(String renk, int kilo, String cinsi) {
       setRenk(renk);
       setKilo(kilo);
       setCinsi(cinsi);
    }

    public void konustu()
    {
        System.out.println("ses çıkardı");
    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk)
    {
        this.renk = renk;
    }

    public int getKilo()
    {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public void setCinsi(String cinsi)
    {
        this.cinsi = cinsi;
    }

    public String getCinsi()
    {
        return cinsi;
    }

    @Override
    public String toString() {
        return "Hayvan:" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cinsi='" + cinsi + '\''
                ;
    }
}
