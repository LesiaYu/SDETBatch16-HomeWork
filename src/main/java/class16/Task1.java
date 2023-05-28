package class16;

public class Task1 {

    //create a method that will accept an array as parameters and will return
    // a sum of all elements from that array. Method should be visibly only within same package
    // and accessible by creating an instance of the class

    int sumArrays (int [] arr){
        int sum=0;
        for (int number:arr) {
            sum=sum+number;

        }return sum;
    }
    public static void main(String[] args) {

        Task1 task1=new Task1();

        int result=task1.sumArrays(new int[] {10,20,30,} );
        System.out.println(result);
    }


}
