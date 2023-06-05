package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) {

        try{
            FileInputStream fileInputStream=new FileInputStream("D:\\WWW\\SDET16\\Files\\Employee.xlsx");
        }catch (FileNotFoundException foundException){
            System.out.println("Hey the file that you are trying to read is not found onn tha address specified");
        }
        System.out.println("line 6");
        System.out.println(10/0);
    }
}
