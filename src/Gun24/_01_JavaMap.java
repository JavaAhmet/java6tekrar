package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Set-> HashSet,LinkedHashSet,TreeSet
        // Map-> HashMap,LinkedHashMap,TreeMap
        // Map-> Anahtar+Set->Anahtarlı Set(Tekrar eden anahtarları yok)

       // anahtarın tipi Integer, tipi  (değerin) value nin tipi String
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1001,"İsmet TEMUR");
        hm.put(1002,"Kaan TEFEK");
        hm.put(2001,"Gökçen TEFEK");
        hm.put(5001, "Elife Sözen");
        hm.put(1002,"Nesli TEFEK");
        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(5001) = " + hm.get(5001));
        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(5002) = " + hm.containsKey(5002));
        System.out.println("hm.keySet() = " + hm.keySet()); // keyleri toplu olarak verir
        System.out.println("hm.values() = " + hm.values());// değerleri toplu verir

        hm.remove(5001);
        System.out.println("hm = " + hm);
        ;
    }
}
