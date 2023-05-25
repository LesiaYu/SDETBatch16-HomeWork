package GroupTasks2;

public class Registration9 {

    //Create Registration Class in which you would have variables as
    //email, userName and password that have an access scope only
    //within its own class. After creating an object of the class user should
    //be able to call methods and in each method separately pass values
    //to set users email, username and password.
    //Requirements:
    //A. Valid email consider to be only yahoo
    //B. Valid userName and password cannot be empty and should be of
    //length larger than 6 characters. Also valid password cannot contain
    //userName.

    private String email;
    private String userName;
    private String password;

    public void passUserName(String userName){
        if(!userName.isEmpty() && userName.length()>6){
            System.out.println("Valid userName");
        }else{
            System.out.println("Valid userName cannot be empty and should be larger than 6 characters");
        }
    }

    public void passEmail(String email){
        if(email.contains("yahoo")){
            System.out.println("Valid email");
        }else{
            System.out.println("Valid email consider to be only yahoo");
        }
    }

    public void passPassword(String password){
        if(!password.isEmpty() && password.length()>6 && !password.equals(userName)){
            System.out.println("Valid password");
        }else{
            System.out.println("Valid password cannot be empty, should be larger than 6 characters and cannot contain userName");
        }
    }

    public static void main(String[] args) {

        Registration9 reg=new Registration9();
        reg.passEmail("lesia@google.com");
        reg.passUserName("Lesiay");
        reg.passPassword("Lesia234");

    }

}
