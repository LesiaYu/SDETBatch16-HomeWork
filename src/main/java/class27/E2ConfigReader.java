package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigReader {
    public static void main(String[] args) throws IOException {



        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        String userName=getProperty("userName");
        username.sendKeys(userName);
        WebElement passwordField=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        String password=getProperty("password");
        passwordField.sendKeys(password);
        WebElement loginBtn=driver.findElement(By.xpath("//input[contains(@id, 'btn')]"));
        loginBtn.click();
    }
    public static  String getProperty(String key) throws IOException {
        FileInputStream fis= new FileInputStream(Constants.CONFIG_READER_PATH);
        Properties properties=new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }
}
