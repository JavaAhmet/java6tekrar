package Gun44;

public class Soru23 {
    public static void main(String[] args) {
        int []stack={10,20,30};
        int size=3;
        int idx=0;
//      do{
//           idx++; // 1
//         }while(idx>=size); // 1>=3   böyleyse dön   , sonuç idx=1

//        while (idx < size)
//            idx++; // 1,2,3  : sonuç idx=3 : HATA

//        do{
//            idx++;
//        }while(idx<=size); // idx<=3  , sonuç: 4 facia


//        while(idx <= size-1) // idx<=2
//            idx++; // en son idx=3 olur, Exception


            do {
                idx++;
            }while (idx<size-1);

        System.out.println("idx = " + idx);
        System.out.println("The top element= " + stack[idx]);

    }
}
