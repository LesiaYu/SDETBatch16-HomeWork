package class14.HW;

public class Task1 {

    /* Create a method that will say Hello in different language based
    on the country that will passed when method is executed.
     */

      void println( String country){

          if (country.equalsIgnoreCase("USA")){
              System.out.println("Hello");
          }else if(country.equalsIgnoreCase("Ukraine")){
              System.out.println("Привіт!");
          }else if (country.equalsIgnoreCase("Poland")){
              System.out.println("Cześć");
          } else if (country.equalsIgnoreCase("Germany")) {
              System.out.println("Hallo");
          } else if (country.equalsIgnoreCase("Italy")) {
              System.out.println("Ciao");
          }
      }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        obj.println("Italy");
    }

}
