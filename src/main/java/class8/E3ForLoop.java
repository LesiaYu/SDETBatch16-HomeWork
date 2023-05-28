package class8;

public class E3ForLoop {
    public static void main(String[] args) {

        int sum=0; //creating a variable to hold the sum

        for (int i=1; i<=10; i++) {
            if (i%2==0) {   //checking  if a number is even
                sum=sum+i; //sum+=i; adding oll the even numbers to the sum
            }
        }
        System.out.println(sum);

    }
}
