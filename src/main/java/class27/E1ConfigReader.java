package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {

        //String path="D:\\WWW\\SDET16\\Files\\Config.properties";

        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";// add location

        //System.out.println(System.getProperty("user.dir"));
        //System.out.println(path1);
        FileInputStream fis=new FileInputStream(path); //navigate to location, brings
        Properties prop=new Properties();
        prop.load(fis);

        System.out.println(prop.getProperty("userName"));



    }


}
