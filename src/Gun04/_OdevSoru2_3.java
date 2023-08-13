package Gun04;

public class _OdevSoru2_3 {
    public static void main(String[] args) {

        System.out.println("başla");

        String para1="100";

        String para2="200";
        String para3="300";

        int rakamPara1=Integer.parseInt(para1);
        int rakamPara2=Integer.parseInt(para2);
        int rakamPara3=Integer.parseInt(para3);

         int ParaToplam= rakamPara1+rakamPara2+rakamPara3;
        System.out.println("ParaToplam = " + ParaToplam +"tl");

        System.out.println("dur");

        /* *********************************************  */

        String taksit1="150";
        String taksit2="185";
        String taksit3="95";

        double rakamTaksit1=Double.parseDouble(taksit1);
        double rakamTaksit2=Double.parseDouble(taksit2);
        double rakamTaksit3=Double.parseDouble(taksit3);

        double taksitTop=rakamTaksit1+rakamTaksit2+ (double)rakamTaksit3;
        System.out.println("taksitTop = " + taksitTop);

        double ortalamaTak=taksitTop/ (double)3;
        System.out.println("ortalamaTak = " + ortalamaTak);
    }
}
