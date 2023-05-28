package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter any number greater that 1");
        int lastNumber= scanner.nextInt();

        int counter =1;
        while (counter<=lastNumber){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
