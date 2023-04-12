package class7;

public class HomeWork3 {
    public static void main(String[] args) {

        /*Print even numbers from 20 to 1 (2 ways)*/

        int counter=20;
        while (counter>=1){
            System.out.print(counter+" ");
            counter-=2;
        }

        System.out.println();
        for (int counter1=20; counter1>=1; counter1-=2){
            System.out.print(counter1+" ");
        }
    }
}
