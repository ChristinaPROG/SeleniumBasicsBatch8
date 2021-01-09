package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver","C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get("http://google.com");
        driver.navigate().to("http://facebook.com");
        driver.navigate().back();
        driver.navigate().forward ();
        Thread.sleep(1000);//pauses the thread for the given millisecs
        driver.navigate().forward ();
        driver.navigate ().refresh ();
      //  driver.close ();
        driver.quit ();// will quit the whole browser
    }
}
