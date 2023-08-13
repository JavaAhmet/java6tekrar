package Gun12;

public class _01_JavaRandom {
    public static void main(String[] args) {
// Math.random(): double sayı üretir.0-0,9999999999 arası üretir
        double randSayi =Math.random(); // 0-0,9999999999999999
        System.out.println("randSayi = " + randSayi);
        // 0-0,99999999999
        // 10 la çarparsam
        //0-9,99999999999
        // (int) 0-9
        int rndTamsayi= (int)(Math.random()*10);// (int) (random*10)
        System.out.println("rndTamsayi = " + rndTamsayi);
    }
}
