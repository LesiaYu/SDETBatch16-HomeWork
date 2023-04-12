package class4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        System.out.println("What is your city and air temperature in Fahrenheit?");
        Scanner scanner=new Scanner(System.in);
        String city= scanner.next();
        int temperature= scanner.nextInt();

        double temperature2=(temperature-32)/1.8;
        System.out.println("The temperature is "+temperature2+" the city is "+city);

    }
}
