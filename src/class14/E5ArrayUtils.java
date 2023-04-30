package class14;

public class E5ArrayUtils {

     boolean contains (int[] array,int num) {

         boolean isFound=false;

         for (int i = 0; i < array.length; i++) {

             if (array[i] == num) {
                 isFound=true;
             }
         }return isFound;
     }

}
