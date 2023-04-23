package class12;

public class E2StringDemo {
    public static void main(String[] args) {

        String username="admin";
        String password = "pas123";

        if(username.length()<8 && password.length()<8){
            System.out.println("Signup successful");
        }else{
            System.out.println("Username and password can't be more than 8 character");
        }
    }
}
