package GroupTasks;

public class HW2 {
    public static void main(String[] args) {
        //Create an array of integer values. After the array is
        //created, calculate the sum of all stored elements in
        //that array.

        int [] elements = {5,8,2,7,9,10,10,9};

        int sum=0;
        for (int i = 0; i < elements.length; i++) {
            sum=sum+elements[i];

        }
        System.out.println(sum);

    }
}
