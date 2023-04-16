package GroupTasks;

public class HW4 {
    public static void main(String[] args) {

        //Create a 2D array of integers. Develop a program
        //which will calculate the sum of even and odd numbers
        //for that array.

        int [][] numbers={
            {2,8,5,7},
                {6,9,2,0,8},
                {4,8,7}
        };

        int sum=0;
        int sum1=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    sum=sum+numbers[i][j];
                }else {
                    sum1=sum1+numbers[i][j];
                }
            }
        }System.out.println("The sum of even numbers is "+sum);
        System.out.println("The sum of odd numbers is "+sum1);
    }
}
