package class15;

public class SyntaxEmployee {

    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects

    String empID;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {

        SyntaxEmployee Lesia=new SyntaxEmployee();
        Lesia.empID="2334";
        Lesia.salary=90000;
        System.out.println(Lesia.empID);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee Sohel=new SyntaxEmployee();
        Sohel.empID="109992";
        Sohel.salary=99650;
        System.out.println(Sohel.empID);
        System.out.println(SyntaxEmployee.CEO);

    }




}
