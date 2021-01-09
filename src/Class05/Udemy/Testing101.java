package Class05.Udemy;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@VisibleForTesting
public class Testing101 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "https://the-internet.herokuapp.com/login" );
        System.out.println ("Page is Open" );
                         //sleep for 2 seconds
                          Thread.sleep ( 2000 );
                    //maximize browser
                    driver.manage ().window ().maximize ();
                       //EnterUserName
        WebElement username = driver.findElement ( By.id ( "username") );


                    //EnterPassword

                //ClickLogin Button

        //



        //Close Browser
        driver.quit ();
    }
}