package Gun37._01_Soru;

public class TeslaCar extends Vehicle implements IElectric{

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return"Bataryanızın 9 yıl ömrü var";
    }

    @Override
    public String driver() {
        return "Auto plot özelliği var";
    }
}
