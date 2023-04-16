package GroupTasks;

public class HW8 {
    public static void main(String[] args) {

       //Maximum and minimum number in the array?

        int [][] numbers={
                {21,5,3,9},
                {4,7,1,2},
                {10,8}
        };

        int maximum=0;
        int minimum = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length;j++) {
                if (numbers[i][j]>maximum){
                    maximum=numbers[i][j];
                }
                if (numbers[i][j]<minimum){
                    minimum=numbers[i][j];
                }
            }
        } System.out.print("The maximum number is "+maximum);
        System.out.println();
        System.out.print("The minimum number is "+minimum);
    }
}
