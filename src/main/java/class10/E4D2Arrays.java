package class10;

public class E4D2Arrays {
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,30},
                {20,50,65},
                {102,54,60}
        };

        for (int j = 0; j < matrix.length; j++) {
            int [] arr1=matrix[j];                   //getting the complete one D array from 2D array
            for (int i = 0; i < arr1.length; i++) {  //going over all the elements from oneD array
                System.out.print(arr1[i]+" ");
            }
                        System.out.println();
        }



    }
}
