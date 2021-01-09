package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskExplicit {
    public static String url = "http://syntaxtechs.com/selenium-practice/dynamic-data-loading-demo.php\n";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );

        WebElement getNewUserButton = driver.findElement ( By.id ( "startButton" ) );



        WebDriverWait wait= new WebDriverWait ( driver,20);

        WebElement welcome = driver.findElement(By.xpath ( "//*[contains(text(),'Welcome')]" ));







    }}
