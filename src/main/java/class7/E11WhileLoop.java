package class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        int counter=100;
        while (counter>=1){
            System.out.print(counter+" ");
            counter--;
        }

        int counter1=20;
        System.out.println();
        while (counter1<=100){
            System.out.print(counter1+"  ");
            counter1+=2;
        }

        int counter2=100;
        System.out.println();
        while (counter2>=1){
            if (counter2%2==1){ //counter2%2!=0
                System.out.print(counter2+" ");
            }
            counter2--;
        }
    }
}
