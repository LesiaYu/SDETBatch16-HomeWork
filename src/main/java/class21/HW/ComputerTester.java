package class21.HW;

public class ComputerTester {

    public static void main(String[] args) {
        Computer [] comp={new Apple("MacBook Air 13", 2022,345673, 865.99),
                          new Lenovo("ThinkBook 14 G2 ITL",2019,444567,655.99),
                          new HP("ProBook 455 G8", 2023,546,700.99),
                           new Dell("Latitude 7420", 2020,7420,501.99)};

        for (Computer com:comp){
            com.work();
            com.stop();
            com.provide();
        }

        Computer comp1=new Apple("MacBook Air 14", 2023, 555,1000.99);
        Apple c=(Apple)comp1;
        c.does();

        Computer comp2=new HP("ProBook 667", 2022, 667,444.44);
        HP h=(HP)comp2;
        h.make();
    }
}
