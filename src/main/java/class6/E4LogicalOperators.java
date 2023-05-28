package class6;

import java.util.Scanner;

public class E4LogicalOperators {
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        System.out.println("Please Enter your height");
        int height= scanner.nextInt();

        if (height<60){
            System.out.println("You are Short");
        }else if (height>=60 && height<=72){
            System.out.println("You are medium");
        }else{
            System.out.println("You are tall");
        }
        }


    }

