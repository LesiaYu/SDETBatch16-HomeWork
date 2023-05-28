package class6;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=scanner.nextLine();
        System.out.println(country);
        System.out.println("Which language do you speak?");
        String language= scanner.nextLine();

        System.out.println("Enter grade");
        String grade= scanner.nextLine();

        if (grade.equals("A")){
            System.out.println("A-Excellent");
        }else if (grade.equals("B")){
            System.out.println("B-Good");
        }else if (grade.equals("C")){
            System.out.println("C-Average");
        }else if (grade.equals("D")){
            System.out.println("D-Bad");
        }else {
            System.out.println("Not Acceptable");
        }

    }

}
