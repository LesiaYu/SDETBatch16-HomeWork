package class19.HW;

public class Task2 {

    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    static void add(int a, int b){
        System.out.println(a+b);
    }

    static void add(long a, int b){
        System.out.println(a+b);
    }

    static void add(int a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add(4,3);
        add(654L,23);
        add(65,98.3);
    }
}
