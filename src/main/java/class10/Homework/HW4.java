package class10.Homework;

public class HW4 {
    public static void main(String[] args) {

//Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
// Print the sum of all numbers.

        int [][] numbers={
                {54,76,54},
                {32,74,90},
                {12,76,50}

        };

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum=sum+numbers[i][j];

            }

        }System.out.println(sum);

    }
}
