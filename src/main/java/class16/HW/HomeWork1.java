package class16.HW;

public class HomeWork1 {

    // Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    public String word(String name ){
        String reverse="";
        for (int i = name.length()-1; i>=0; i--) {
            reverse=reverse+name.charAt(i);

        }return reverse;

    }

    public static void main(String[] args) {
        HomeWork1 obj=new HomeWork1();
        String result=obj.word("Lesia");
        System.out.println(result);
    }
}
