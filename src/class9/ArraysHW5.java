package class9;

public class ArraysHW5 {
    public static void main(String[] args) {

        //Create an array of animals and store 5 elements into it.
        // Using 2 different loops print all elements from the array.

        String [] animals={"Dog","Cat","Leopard","Butterfly","Cow"};
        for(String animal:animals){
            System.out.print(animal+" ");
        }

        System.out.println();

        String [] animals1={"Dog","Cat","Leopard","Butterfly","Cow"};
        for (int i = 0; i < animals1.length; i++) {
            System.out.print(animals1[i]+" ");

        }



    }
}
