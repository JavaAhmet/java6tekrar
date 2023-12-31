package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";
        cumle = cumle + "Bugün"; // Bugün
        cumle = cumle + " hava"; // atama gerektirir.
        cumle += " çok soğuk";
        System.out.println("cumle = " + cumle);
        System.out.println("cumle = " + cumle + " değil mi?");
        // cumle değeri değişmez atama gerektriri
        // bu gün hava çok soğuk

        System.out.println("cumle.concat()=" + cumle.concat(" dün değildi."));

        System.out.println("cumle = " + cumle);

        cumle.concat(" merhaba");// cumlenin değeri değişmez
        cumle = cumle.concat("merhaba"); // cümlenin değeri değişir,atama gerektirir.
        System.out.println("cumle = " + cumle);
        /****************StringBuilder**********************/
        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugün");
        cumle2.append(" hava");
        cumle2.append(" soğuk");

        System.out.println("cumle2 = " + cumle2);

        // **************** +, concat,StringBuilder 3 model hız testi******/

        long startTime = System.currentTimeMillis();
        StringBuilder test3 = new StringBuilder();
        // String test1 = "";
        //   String test2 = "";
        for (int i = 0; i < 30000000; i++) {
            // test1 = test1 + "merhaba";
            // test2 = test2.concat("merhaba");
            test3.append("merhaba");
        }

        System.out.println("+ için geçen süre=" +
                (System.currentTimeMillis() - startTime) + " ms");

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("\n\n*********StringBuilder**************\n\n");
        /*  StringBuilder ı yakından tanıyalım   */

        StringBuilder sb=new StringBuilder();
        sb.append("Bugün");// kendine ekleme, atama gerektrmiyor
        sb.append(" hava ");
        sb.append(" biraz");
        sb.append(" soğuk");
        System.out.println("sb = " + sb);
        System.out.println("sb.length() = " + sb.length());
        sb.append(4);
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);
        sb.delete(0,5); //index 0 dahil 5 hariç siliyor.
        System.out.println("sb = " + sb);
        sb.deleteCharAt(3); // sadece belirtilen indexteki karakteri siler
        System.out.println("sb = " + sb);
        sb.insert(5, "kelime"); // 5 nolu indexe kelimeyi ekle ,araya ekleme
        System.out.println("sb = " + sb);

        String parca=sb.substring(5,8); // 5 dahil 8 değil
        System.out.println("parca = " + parca);

        // string fonksiyonlar için toString demek yeterli
        sb.toString().endsWith("de");
        sb.replace(5,8, "Saç"); // verilen aralığa verilen kelime eklenir
        System.out.println("sb = " + sb);

        sb=new StringBuilder();// tamamen sıfırlamak için
        sb=new StringBuilder("Bugün hava soğuk ");// ilk tanımlandığında kelime atanabilir.
        System.out.println("sb = " + sb);
        StringBuffer sBuffer=new StringBuffer(); // tamamen String Builder ile aynı
        // tek farkı paralel çalışan yazılımlar için kullanılır.



    }
}
