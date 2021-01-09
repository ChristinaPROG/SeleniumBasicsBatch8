package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

        public static String url = "http://www.uitestpractice.com/Students/Switchto";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver ( );
            driver.get ( url );
            driver.manage ().window ().maximize ();
            WebElement simpleAlertButton = driver.findElement ( By.id ("alert" ) );
          simpleAlertButton.click ();
Thread.sleep ( 5000 );
           Alert simpleAlert= driver.switchTo ().alert (); /// ALERT was my id after inspect
            //handle simple alerts
simpleAlert.accept ();
WebElement confirmAlertButton= driver.findElement ( By.id("confirm" ));
Thread.sleep ( 5000 );
Alert confirmAlert = driver.switchTo ( ).alert ( );
//handling confiramtion alert
confirmAlert.dismiss ();
String confirmAlertText= confirmAlert.getText ();
            System.out.println (confirmAlertText );
            confirmAlert.dismiss ();

        }
    }