package GroupTasks2;

public class Task10Test {
    //10. Provide Implementation for the diagram below. Then create a test class
    //in which you need to create Objects of ChromeDriver, FirefoxDrive and
    //SafariDriver classes and see which methods available to them.
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.open();
        chromeDriver.navigate();
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.open();
        firefoxDriver.navigate();
        System.out.println(firefoxDriver.getTitle());
        firefoxDriver.close();

        SafariDriver safariDriver = new SafariDriver();
        safariDriver.open();
        safariDriver.navigate();
        System.out.println(safariDriver.getTitle());
        safariDriver.close();

    }
}
