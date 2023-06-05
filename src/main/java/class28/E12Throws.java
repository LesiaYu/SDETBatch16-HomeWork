package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E12Throws {
    public static void main(String[] args) throws FileNotFoundException {

        print();

    }

    static void print() throws FileNotFoundException {

        FileInputStream fileInputStream=new FileInputStream("sdsd");
    }
}
//Create a method to check age eligibility that will throw a runtime exception.
// Method should throw an exception age is less than 16.
//Create a method checkUserName that will throw a runtime exception.
// Method should throw an exception when entered username is less than 5 characters.
