package class8;

public class E10NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 2; j <= 10; j+=2){
                System.out.print(j+" ");

            }System.out.println();
        }
        System.out.println();



        int i=0;
        while (i<4){
            for (int j=2; j<=10 ; j+=2){
                System.out.print(j+" ");
            }
            System.out.println();
            i++;

        }

    }
}

