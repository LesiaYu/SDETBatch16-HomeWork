package class11;

public class E6D2Array {
    public static void main(String[] args) {

        int[][] arr2D = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        int sum = 0;
        for (int[] row1 : arr2D) {
                                            //or put int sum=0 here
            for (int numbers : row1) {
                sum = sum + numbers;

            }System.out.print(sum);
            sum=0;
            System.out.println();




        }

    }
}





