package class6;

public class E5SwichStatment {
    public static void main(String[] args) {

        char gender='0';

        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case '0':
                System.out.println("Others");
                break;
            default:
                System.out.println("Char not support");
        }
    }
}
