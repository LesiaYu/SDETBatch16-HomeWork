package class12.HW;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
              // Write a program that reads two people's first
              //names and if they expecting boy or girl?
              //Based on the input suggests a name for a baby:

        Scanner scanner=new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String nameMother= scanner.nextLine();
        System.out.println("Dad’s first name?");
        String nameFather= scanner.nextLine();
        System.out.println("Boy or Girl");
        String gen= scanner.nextLine();


                if(gen.equals("Boy")){
                    System.out.println(nameFather.substring(0,nameFather.length()/2)+nameMother.substring(nameMother.length()/2));
                }else if(gen.equals("Girl")){
                    System.out.println(nameMother.substring(0,nameMother.length()/2)+nameFather.substring(nameFather.length()/2));
                }else{
                    System.out.println("Not found");


        }

        }


    }

