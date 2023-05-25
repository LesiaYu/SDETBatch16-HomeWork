package class22;

public class Replit {
    String reverseWord=" ";

    final String method1(String word){
        for (int i=word.length()-1; i>=0; i--){
            reverseWord=reverseWord+word.charAt(i);
        }
        return reverseWord;
    }

    public static void main (String [] args){
        Replit obj=new Replit();
        String result= obj.method1("lesia");
        System.out.println(result);
    }


}

