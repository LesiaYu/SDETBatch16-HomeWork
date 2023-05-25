package GroupTasks2;

import java.util.Arrays;

public class Task4 {
    //Check if Two Strings are Anagrams: Given two strings, determine if
    //they are anagrams, meaning they contain the same characters in a
    //different order. For example, "listen" and "silent" are anagrams

     static void areAnagrams(String word1, String word2){
        boolean status=true;
        if(word1.length()==word2.length()) {
            char[] w1 = word1.toLowerCase().toCharArray();
            char[] w2 = word2.toLowerCase().toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);

           if(Arrays.equals(w1,w2)){
               System.out.println(word1+" and "+word2+" are anagrams");
           }else{
               System.out.println(word1+" and "+word2+" are not anagrams");
           }
        }else{
            status=false;
            System.out.println("Strings are not anagrams");
        }
    }

    public static void main(String[] args) {
        Task4 obj=new Task4();
        obj.areAnagrams("Listen", "Silenq");
    }
}
