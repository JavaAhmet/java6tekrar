package Gun31._02_Soru;

public class Program {
    public static void main(String[] args) {
        User user1=new User("ismet",Role.ADMİN,Status.AKTIF);
        User user2=new User("mehmet",Role.SATIS,Status.PASİF);
        User user3=new User("ayse",Role.MUDUR,Status.AKTIF);


        User.userSil(user1); // admin silinemez
        User.userSil(user2);// user silindi
        User.userSil(user3);// user silindi



        //if (user1.role==Role.ADMİN)
            // kullanıcı silebilir
    }
}
