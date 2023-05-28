package class9;

public class E4Arrays {
    public static void main(String[] args) {

        String [] names={"Lesia", "Katya", "Ihor", "Sofia", "Veronika"};

        for (int i=0; i<names.length; i++){
            System.out.print(names[i]+" ");
        }
        System.out.println();

        int counter=0;
        while(counter< names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }
    }
}
