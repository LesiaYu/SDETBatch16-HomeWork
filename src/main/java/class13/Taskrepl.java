package class13;

import java.util.Scanner;

public class Taskrepl {
    public static void main(String[] args) {
        String [] names= new String[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 5 names");
        names[0]=scanner.nextLine();
        names[1]=scanner.nextLine();
        names[2]=scanner.nextLine();
        names[3]=scanner.nextLine();
        names[4]=scanner.nextLine();

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[0].indexOf('0','2'));
        }

    }
        }




