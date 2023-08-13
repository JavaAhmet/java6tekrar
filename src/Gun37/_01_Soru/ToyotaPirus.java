package Gun37._01_Soru;

public class ToyotaPirus extends Vehicle implements IElectric,IGas {


    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {

        return "Ömür boyu kullanılır";
    }

    @Override
    public String changeOil() {
        return"Bir depo ile 300 km gider";
    }

    @Override
    public String driver()
    {
        return"İlk 3 km elektrikle gider";
    }
}
