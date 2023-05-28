package class7;

public class E10WhileLoop {
    public static void main(String[] args) {

        int counter=1;
        while (counter<=20){
            if (counter%3!=0){
                System.out.print(counter+" ");
            }
            counter++;

        }
    }
}
        /* if (counter!=3 && counter!=6 && counter!=9 && counter!=12 && counter!=15 && counter!=18){*/