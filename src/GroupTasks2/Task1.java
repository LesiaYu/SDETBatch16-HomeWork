package GroupTasks2;

public class Task1 {
    //Reverse a String: Write a function to reverse a given string. For
    //example, given the input "Hello", the output should be "olleH"

    String reverseString(String given){
        String reverse=" ";
        for (int i = given.length()-1; i >=0 ; i--) {
            reverse=reverse+given.charAt(i);
        }return reverse;
    }

    public static void main(String[] args) {

        Task1 obj=new Task1();
        String result=obj.reverseString("Hello");
        System.out.println(result);

    }
}
