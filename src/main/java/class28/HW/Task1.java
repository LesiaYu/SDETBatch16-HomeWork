package class28.HW;

public class Task1 {

    // Create a method to check age eligibility that will throw a runtime exception.
    // Method should throw an exception age is less than 16.

     public static void ageEligibility(int age) {
         try {
             if (age < 16) {
                 throw new Exception();
             } else {
                 System.out.println("Is eligible");
             }
         }catch (Exception e){
             System.out.println("Is not eligible, exception occurred");
         }
     }

    public static void main(String[] args){

        ageEligibility(12);

    }
}

