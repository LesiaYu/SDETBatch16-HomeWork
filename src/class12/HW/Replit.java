package class12.HW;

public class Replit {
    public static void main(String[] args) {

        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        for (int i=0; i<str.length();i++){
        }System.out.println(str.indexOf('c'));

        for (int i=0; i<str.length();i++){
        }System.out.println(str.indexOf(' '));

        int IndexOfSubTarget1=str.toLowerCase().indexOf(target1);
        System.out.println(IndexOfSubTarget1);

        int IndexOfSubTarget2=str.toLowerCase().indexOf(target2.toLowerCase());
        System.out.println(IndexOfSubTarget2);
    }
}
