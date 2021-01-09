package Class06.Review6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorRecap {
/* What does CSS stand for?-- Cascade Style Sheets
cssSelector is faster and more simple
xpath is more flexible

Basic syntax of CSS
tagName[attributes='attributeValue']

tagName#idValue --> tagName[id='idValue']
tagName.classValue -->tagName[class='classValue']

starts with
tagName[attributes^='attributeValue']

contains
tagName[attributes*='attributeValue']

ends with
tagName[attributes$='attributeValue']



 */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "http://syntaxtechs.com/selenium-practice/index.php" );


        //Lets check wheather Syntax




    }
}
