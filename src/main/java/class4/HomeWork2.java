package class4;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        /*You are a loan specialist and you need to ask user what is the amount of loan
is needed. If loan is less or equal to 200,000 then you would lend the money
otherwise you would reject the client.*/


        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the amount of loan is needed?");

        double loan=scanner.nextDouble();

        if (loan<=200.000){
            System.out.println("I would lend the money");
        }else {
            System.out.println("You are reject");
        }



    }


}
