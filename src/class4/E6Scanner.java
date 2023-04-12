package class4;

import java.util.Scanner;
import java.util.SortedMap;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scanner.next();
        if (name.equals("Lesia")){
            System.out.println("Mac user");
        }else {
            System.out.println("Windows user");
        }
    }
}
