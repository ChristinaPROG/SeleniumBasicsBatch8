package SeleniumRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

public class PageObjects {
    public static void main(String[] args) {


        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
                WebDriver driver = new ChromeDriver ( );
driver.manage ().window ().maximize ();
driver.get ( "https://www.amazon.com/" );
 driver.findElement ( By.id("searchDropdownBox") ).click ();
        WebElement deptBtn= driver.findElement ( By.id ( "searchDropdownBox" ));
        deptBtn.click ();
        deptBtn.isDisplayed ();
        deptBtn.isEnabled ();

    WebElement deptBtn2=driver.findElement ( By.name ( "url" ) );

        deptBtn2.click();


    }
}