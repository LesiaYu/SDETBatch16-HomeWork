package class10.Homework;

public class HW5 {
    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will identify/print the even numbers only.

        int [][] numbers={
                {12,9,4,3},
                {10,5,8,2},
                {11,4,6,7}

        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int num=numbers[i][j];
                if (num%2==0){
                    System.out.print(num+" ");
                }

            }

        }

    }
}
