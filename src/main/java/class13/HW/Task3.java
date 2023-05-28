package class13.HW;

public class Task3 {
    //How would you swap  2 strings without a temporary variable?

    public static void main(String[] args) {

        String word1="Lesia";
        String word2="Veronica";
        System.out.println("word1 "+word1+" word2 "+word2);

        word1=word1+word2;
        word2= word1.substring(0,word1.length()-word2.length());
        word1=word1.substring(word2.length());

        System.out.println("word1 "+word1+" word2 "+word2);






    }
}
