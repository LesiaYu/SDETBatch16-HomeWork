package GroupTasks2;

public class Task5 {
    //Find the First Non-Repeating Character in a String: Given a string,
    //find and return the first non-repeating character. For example, in the
    //string "abracadabra", the first non-repeating character is 'c'.

    static void firstNonRepeatingChar(String word){

        char [] w=word.toLowerCase().toCharArray();
        for (char i:w) {

            if (word.indexOf(i)==word.lastIndexOf(i)){
                System.out.println("the first non-repeating character is "+i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Task5 obj=new Task5();
        obj.firstNonRepeatingChar("abracadabra");

    }
}
