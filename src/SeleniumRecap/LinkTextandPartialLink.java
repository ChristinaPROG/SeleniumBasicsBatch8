package SeleniumRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextandPartialLink {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.manage ( ).window ( ).maximize ( );

        driver.get ( "http://18.232.148.34/humanresources/symfony/web/index.php/" );

        driver.findElement ( By.id("txtUsername") ).sendKeys ( "admin" );
        driver.findElement ( By.id("txtPassword") ).sendKeys ( "Hum@nhrm123" );
        driver.findElement ( By.id("btnLogin") ).click ();

        Thread.sleep ( 3000 );

        driver.findElement ( By.linkText ( "PIM" ) );

    }
}