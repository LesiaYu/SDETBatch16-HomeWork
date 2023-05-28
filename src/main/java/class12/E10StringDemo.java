package class12;

public class E10StringDemo {
    public static void main(String[] args) {

        String name="LEONARDOR";

        System.out.println(name.charAt(1));

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }



        int counter=0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='R'){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
