package class22;

public class FinalDemo {

    final String SSN;
    FinalDemo(String SSN){
        this.SSN=SSN;
    }

    void changeSSN(){
    //    SSN="jjjjjj";          not allowed as value will be assigned already in constructor
    }
}
