package class9;

public class E12 {
    public static void main(String[] args) {

        int [] numbers=new int[5];
        int num=50;
        /*numbers[0]=50;
        numbers[1]=60;
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;*/

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num;
            num=num+10;
        }

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}