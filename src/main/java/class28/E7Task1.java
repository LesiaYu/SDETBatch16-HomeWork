package class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E7Task1 {
    public static void main(String[] args) {
        //InputMismatchException? Input Mismatch Exception when
        // user enters mismatch value then programmer expected

        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("Please enter integer");
            scanner.nextInt();
        }catch (InputMismatchException e ){
            System.out.println("Please enter proper type of data");
        }

    }
}
