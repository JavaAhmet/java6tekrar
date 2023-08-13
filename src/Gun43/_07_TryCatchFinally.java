package Gun43;

public class _07_TryCatchFinally {
    public static void main(String[] args) {
        String str="";
        long startTime=0;

        try{
        startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
        }
        catch(Exception ex){
            System.out.println("catch bloğu çalıştı");
            // hata olduğunda yapılacaklar
        }
        finally { // hat olsada olmasa da çılşır
            System.out.println("try-chatch bloğu ile ilgili son yapılacaklar");
            System.out.println((System.currentTimeMillis()-startTime)+ "ms");
        }
        System.out.println("diğer çalışacak kodlar");
        System.out.println("progrm bitti");
    }
}
