package class28.HW;

public class Task2 {

    //Create a method checkUserName that will throw a runtime exception.
    //Method should throw an exception when entered username is less than 5 characters.
    public static void checkUserName(String name){
        try{
            if(name.length()<5){
                throw new Exception();
            }else{
                System.out.println("It's good, entered username is more than 5 characters");
            }
        }catch (Exception e){
            System.out.println("Entered username is less than 5 characters");
        }
    }

    public static void main(String[] args) {
        checkUserName("Lesia");




    }
}
