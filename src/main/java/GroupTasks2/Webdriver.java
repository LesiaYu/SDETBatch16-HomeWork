package GroupTasks2;

public interface Webdriver{

    void open();
    void close();
    String getTitle();

}

interface RemoteWebDriver extends Webdriver{
    void navigate();

}

interface TakesScreenshot extends RemoteWebDriver{

    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver{
    @Override
    public void navigate(){
        System.out.println("Navigate to ChromeDriver");
    }
    @Override
   public void open(){
        System.out.println("Open ChromeDriver ");
    }
    @Override
    public void close(){
        System.out.println("Close ChromeDriver ");
    }
    @Override
    public String getTitle(){
       return "ChromeDriver title";
    }
}

class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void navigate(){
        System.out.println("Navigate to FirefoxDriver");
    }
    @Override
    public void open(){
        System.out.println("Open FirefoxDriver ");
    }
    @Override
    public void close(){
        System.out.println("Close FirefoxDriver ");
    }
    @Override
    public String getTitle(){
        return "FirefoxDriver title";
    }

}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void navigate(){
        System.out.println("Navigate to SafariDriver");
    }
    @Override
    public void open(){
        System.out.println("Open SafariDriver ");
    }
    @Override
    public void close(){
        System.out.println("Close SafariDriver");
    }
    @Override
    public String getTitle(){
        return "SafariDriver title";
    }

}