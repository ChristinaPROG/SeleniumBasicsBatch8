package Class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver ( );
            driver.get ( "http://syntaxtechs.com/selenium-practice/index.php" );



        }
    }