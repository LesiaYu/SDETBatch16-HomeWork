package class13.HW;

public class Task2 {
    //How would you check if String is palindrome or not? aba=> true
    //Abbc =>false

    public static void main(String[] args) {
        String word = "SIviC";
        String reverseword="";

        for (int i = word.length()-1; i >=0; i--) {
            reverseword=reverseword+word.charAt(i);
        };

        if (word.toLowerCase().equals(reverseword.toLowerCase())){
            System.out.println(word+" is palindrome String");
        }else{
            System.out.println(word+" is not palindrome String");
        }

    }
}
