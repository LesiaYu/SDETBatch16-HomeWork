package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties getProperties(String path) throws IOException {
        FileInputStream fileInputStream=null;
        Properties properties=null;

        try {
            fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);

        }catch (Exception e){
            System.out.println("Please check the file at the path if it is available"+Constants.CONFIG_READER_PATH);
        } finally {
            try{
                if(fileInputStream!=null){
                    fileInputStream.close();
                }
            }catch (IOException e){
                System.out.println("Something bad happened with the file");
            }
        }
        return properties;
    }

    public static String getProperty(String key) throws IOException {
        Properties properties=getProperties(Constants.CONFIG_READER_PATH);
        String value=properties.getProperty(key);
        return value;

    }
}
