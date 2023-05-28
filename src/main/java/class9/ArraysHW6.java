package class9;

public class ArraysHW6 {
    public static void main(String[] args) {

        //Create an array on integers and calculate the sum of all elements in an array

        int [] numbers={4,6,8,34,67,89,20,45,37,83};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];

        }System.out.println(sum);

        System.out.println();

        int [] numbers1={4,6,8,34,67,89,20,45,37,83};
        int sum1=0;
        for (int num:numbers){
            sum1=sum1+num;

        }System.out.println(sum1);
    }
}
