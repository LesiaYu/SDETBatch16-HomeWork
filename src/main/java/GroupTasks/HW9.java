package GroupTasks;

public class HW9 {
    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array?

        int [] numbers={65,87,23,46,98,11,88,67};

        int largest=numbers[0];
        int secondLargest=numbers[0];

       for (int i=0; i< numbers.length; i++){
           if (numbers[i]>largest){
               secondLargest=largest;
               largest=numbers[i];
           } else if (numbers[i]>secondLargest) {
               secondLargest=numbers[i];

           }
       }
        System.out.print("the second largest number is "+secondLargest);

    }
}
