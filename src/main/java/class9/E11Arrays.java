package class9;

public class E11Arrays {
    public static void main(String[] args) {

       int [] numbers=new int[5];
        numbers[2]=50; //store 50 on index 0
        numbers[0]=100;
        numbers[1]=33;
        numbers[3]=67;
        numbers[4]=32;


        for (int number : numbers) {
            System.out.println(number);
            
        }
       
    }
}
