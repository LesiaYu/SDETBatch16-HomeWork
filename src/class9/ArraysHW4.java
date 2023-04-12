package class9;

public class ArraysHW4 {
    public static void main(String[] args) {
//Create an array of cars and store 6 elements into it.
// Using 2 different loops print all values from the array.

        String [] cars={"Mazda", "Mercedes","BMW","Land-Rower","Porsche","Hyundai"};
        for (String car : cars) {
            System.out.print(car+" ");
        }

        System.out.println();

        String [] cars1={"Mazda", "Mercedes","BMW","Land-Rower","Porsche","Hyundai"};
        for (int i = 0; i < 6; i++) {
            System.out.print(cars1[i]+" ");

        }




    }
}
