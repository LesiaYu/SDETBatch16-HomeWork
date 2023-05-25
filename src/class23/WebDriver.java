package class23;

public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("ChromeDriver is opening");
    }
    @Override
    public void closeBrowser(){
        System.out.println("ChromeDriver is closing");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("ChromeDriver is maximising window");
    }
    @Override
    public void findElement(){
        System.out.println("ChromeDriver finding element");
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("FirefoxDriver is opening");
    }
    @Override
    public void closeBrowser(){
        System.out.println("FirefoxDriver is closing");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("FirefoxDriver is maximizing window");
    }
    @Override
    public void findElement(){
        System.out.println("FirefoxDriver finding element  ");
    }
}
