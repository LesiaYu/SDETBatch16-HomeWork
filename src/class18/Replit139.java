package class18;

public class Replit139 {

    public static String alphabetical(String str){

        str=str.toLowerCase();

        String result=String.valueOf(str.charAt(0));

        for (int i=0; i<str.length()-1; i++){

            if (str.charAt(i)<str.charAt(i+1)){
                result+=String.valueOf(str.charAt(i));

            }
        }return result;
    }
    public static void main (String [] args){
        Replit139 obj=new Replit139();
        String result=obj.alphabetical("hello");
        String result1=obj.alphabetical("software");
        String result2=obj.alphabetical("language");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }
}
