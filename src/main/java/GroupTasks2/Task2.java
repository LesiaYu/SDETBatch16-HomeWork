package GroupTasks2;

public class Task2 {

    //Check if a String is Palindrome: Determine whether a given string is
    //a palindrome, which means it reads the same forwards and
    //backward. For example, "madam" is a palindrome.

    public void isPalindrome(String word){
        String reverseWord="";
        for (int i=word.length()-1; i>=0; i--){
            reverseWord+=word.charAt(i);
        }
        if(word.equals(reverseWord)){
            System.out.println("A string "+word+" is Palindrome");
        }else{
            System.out.println("A string "+word+" is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Task2 obj=new Task2();
        obj.isPalindrome("madam");
    }
}
