package SeleniumRecap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class review01 {
    public static void main(String[] args) throws InterruptedException {


    // 1)Set properties for our webdriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
        // Create an object of WebDriver interface
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // .navigate().to(String URL)
        // lets navigate to ebay
        String ebayUrl="https://www.ebay.com/";
        driver.navigate().to(ebayUrl);
        Thread.sleep(3000);
        // navigate to amazon.com
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
        // navigate back to ebay
        driver.navigate().back();
        // get title and url of the current web page and
        String currentUrl=driver.getCurrentUrl();
        System.out.println("Current URL : "+currentUrl);
        String currentTittle=driver.getTitle();
        Thread.sleep ( 2000 );
        driver.navigate ().forward ();
        Thread.sleep ( 2000 );

    }
}