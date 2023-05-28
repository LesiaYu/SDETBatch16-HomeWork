package class4;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them, otherwise you
will offer them to get a learners permit.*/

        System.out.println("Please Enter your age");
        Scanner scanner=new Scanner (System.in);
        int age= scanner.nextInt();
        if (age>=18) {
            System.out.println("You will get a driver license");
        }else{
            System.out.println("Please get a learners permit");
        }


    }
}
