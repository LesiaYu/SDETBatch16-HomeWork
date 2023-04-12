package class6;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        /*Ask user to enter a number and then define if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000*/

        Scanner scanner=new Scanner (System.in);
        System.out.println("Please Enter a Number");
        int number=scanner.nextInt();

        if (number<=10 && number>0){
            System.out.println("It is a small number");
        } else if (number>=11 && number<=100) {
            System.out.println("It is a medium number");

        }else if (number>=101 && number<=1000){
            System.out.println("It is a large number");
        }else {
            System.out.println("Wrong number");
        }


    }
}
