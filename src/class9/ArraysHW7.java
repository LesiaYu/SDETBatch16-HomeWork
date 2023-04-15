package class9;

public class ArraysHW7 {
    public static void main(String[] args) {

        //From an array of integer elements find the largest number.

        int [] numbers={65,54,37,89,33,47,82};
        int largest=numbers[0];

         for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>largest){
               largest=numbers[i];
            }

        }System.out.println(largest);

        System.out.println();

         int [] numbers1={10,20,50,40,30};
         int largest1= numbers1[0];
         for (int num:numbers1){
             if (num>largest1){
                 largest1=num;
             }


         } System.out.println(largest1);
    }
}
