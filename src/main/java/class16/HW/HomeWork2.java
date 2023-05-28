package class16.HW;

public class HomeWork2 {

    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name

    private String word(String name){

         name=name.replaceAll("[^aeiou]", "");
         return name;

    }

    public static void main(String[] args) {
        HomeWork2 obj=new HomeWork2();
        String result=obj.word("America");
        System.out.println(result);
    }

}
