package GroupTasks;

public class HW7 {
    public static void main(String[] args) {

        //Write a Java Program to print the first 10 numbers of
        //Fibonacci series.
        //int [] FibonnacciSeries={0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 }


     int number1=0;
     int number2=1;

        for (int i=1;i<=10; i++) {

            System.out.print(number1 +" ");
            int nextNumber=number1+number2;
            number1 = number2;
            number2 = nextNumber;


        }

    }





    }





