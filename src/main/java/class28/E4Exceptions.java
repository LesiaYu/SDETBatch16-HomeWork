package class28;

public class E4Exceptions {
    public static void main(String[] args) {

        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");

        //int [] arr=new int[-5]; - error
        //System.out.println(10/0); error

        System.out.println("Line 5");

        //"name".charAt(15);-error

        try {
            String name=null;
            name.length();
            //"name".charAt(2);
            //int [] arr=new int[-5];
            //System.out.println(10/0);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Plan b");
        }catch(NegativeArraySizeException e){
            System.out.println("Plan c");
        }catch (ArithmeticException e){
            System.out.println("Plan d");
        }catch (NullPointerException e){
            System.out.println("Plan f");
        }

        System.out.println("Line 6");

    }
}
