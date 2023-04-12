package class6;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        /*HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user. Please complete this assignment in 2 ways:
        using if statement and switch case.*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter number 1");
        int number1= scanner.nextInt();
        System.out.println("Please Enter number 2");
        int number2= scanner.nextInt();
        System.out.println("Please Enter operator(+,-,*./");
        char operator=scanner.next().charAt(0);
        switch (operator){
            case ('+'):
                System.out.println(number1+number2);
                break;
            case ('*'):
                System.out.println(number1*number2);
                break;
            case ('-'):
                System.out.println(number1-number2);
                break;
            case ('/'):
                System.out.println(number1/number2);
                break;

        }

    }
}
