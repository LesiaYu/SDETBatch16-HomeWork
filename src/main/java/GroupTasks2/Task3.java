package GroupTasks2;

public class Task3 {

    //Count the Number of Words in a String: Write a function to count the
    //number of words in a given string. Words are separated by spaces or
    //punctuation. For example, the input "Hello, world!" should return 2.

    public int countNumbersOfWords (String givenString){
        int count=0;
        String [] words=givenString.split("[.,!? ]");

        for (int i = 0; i < words.length; i++) {
            if (words[i]!=""){
                count++;
            }

        }return count;
    }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        int result=obj.countNumbersOfWords("Hello, world! I like you!!!");
        System.out.println(result);
    }
}
