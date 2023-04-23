package class12;

import java.util.SortedMap;

public class Task {
    public static void main(String[] args) {
        String userName="";
        String password="";
        String confirmYourPassword="Lesia2344Lu999";

        if (userName.isBlank() && password.isBlank()){
            System.out.println("Username or Password cannot be empty");
        } else if (password.length() < 8){
            System.out.println("Password is too short");
        } else if (password.contains(userName)){
            System.out.println("Password cannot contain username");
        } else if(!password.equals(confirmYourPassword)){
            System.out.println("Passwords do not match");

        } else{
            System.out.println("Your username and password has been created");
        }
    }
}
