package class19.HW;

public class Task3 {

    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    private static void multiple(int num1, int num2){
        System.out.println(num1*num2);
    }

    private static void multiple(int num1, double num2){
        System.out.println(num1*num2);
    }

    private static void multiple(int num1, int num2, double num3){
        System.out.println(num1*num2);
    }

    public static void main(String[] args) {
        multiple(7,2);
        multiple(67,32.8);
        multiple(4,6,65.7);

    }
}
