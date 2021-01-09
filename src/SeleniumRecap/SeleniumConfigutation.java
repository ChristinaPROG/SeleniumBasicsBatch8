package SeleniumRecap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfigutation {
    public static void main(String[] args) throws InterruptedException {
      // 1)Set properties for our webdriver
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
       //2) Create an object of webdriver interface
        WebDriver driver = new ChromeDriver ( );
      //3)ChromeDriver(browserDriver) extends RemoteWebDriver
        // RemoteWebDriver implements WebDriver

        //Navigate to specified web application
        String amazonUrl="http://amazon.com";
        //driver.get("http://amazon.com");

        driver.get (amazonUrl);

        String currentUrl=driver.getCurrentUrl ();
        System.out.println (currentUrl );

        String expTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDS & more ";

        String actTitle=driver.getTitle ();
        System.out.println (actTitle );

        if (expTitle.equals ( actTitle )) {
            System.out.println ( "Title validation testPass" );
        }else{
            System.out.println ("Title validation test FAIL" );
        }
String handle= driver.getWindowHandle ();
        System.out.println (handle );

        // navigate()methods--> keeps our browsing history and enables us to specific page or navigate back and forth

    }
}