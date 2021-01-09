package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommand {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "http://syntaxtechs.com/selenium-practice/index.php" );
        WebElement ageRadioButton = driver.findElement ( By.xpath ( "//input[@value='0 -5']" ) );
boolean isRadioBtnEnabled =ageRadioButton.isEnabled ();
boolean isRadioBtnDisplayed=ageRadioButton.isDisplayed ();
        System.out.println (isRadioBtnEnabled );
        System.out.println (isRadioBtnDisplayed );
        System.out.println ("Before clicking " +ageRadioButton.isSelected () );
        ageRadioButton.click ();
        System.out.println ("After clicking " + ageRadioButton.isSelected () );
    }}

