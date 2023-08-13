package Gun43;

public class _03_JavaException {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başladı");
        String kelime="";
        char harf=kelime.charAt(3); // 3. karkter yok.program start dan sonra hata verir

        System.out.println("Program bitti");

        // derleme zamanı hataları:program çalışmadı. COMPİLE ERROR, Exception
        // Program çalışmaya başladıktan sonra oluşan hatalar:RUNTİME ERROR,Exception
    }
}
