package class15;

public class Replit {
    public static String mixString (String s1, String s2){

        String result="";
        if (s1.length()==s2.length()){

            for (int i=0; i<s1.length(); i++){
                result=result+s1.substring(i,i+1)+s2.substring(i,i+1);
            }
        }return result;
    }

    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }

}
