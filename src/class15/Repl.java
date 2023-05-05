package class15;

public class Repl {

    static String thirdLetter(String s){

        for (int i=0; i<s.length(); i+=3){

            s=s+s.charAt(i);

        }return s;
    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}

