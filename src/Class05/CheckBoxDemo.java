package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {
    public static String url="http://syntaxtechs.com/selenium-practice/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get (url);
        List<WebElement>optionsCheckBoxes = driver.findElements (By.xpath ("//input[@class='cb1-element']" ));
        int optionsCount= optionsCheckBoxes.size ();
        System.out.println (optionsCount );
        for(WebElement checkBoxOption: optionsCheckBoxes){
           if ( checkBoxOption.isEnabled ( )){
               String checkBox=checkBoxOption.getAttribute ("value");
                   if (checkBox.equalsIgnoreCase ( "Option-2" ) ){
                       checkBoxOption.click ();
                       Thread.sleep ( 5000 );
                       break;

               }
           }


        }
    }
}
