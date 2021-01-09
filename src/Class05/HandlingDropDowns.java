package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class HandlingDropDowns {

    public static String url = "http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        WebElement daysDD=driver.findElement( By.id ( "select-demo" ));// locate the drop down
        Select select= new Select(daysDD); // create a object of a class
      //  select.selectByIndex ( 2 );// select by index

     //   Thread.sleep ( 3000 );

     //   select.selectByVisibleText ( "Wednesday" ); // to select by visible text in dropdown
     //   Thread.sleep ( 3000 );

     //   select.selectByValue ("Sunday"); // value=same as visible text

        List<WebElement>allOptions = select.getOptions ();
        int size= allOptions.size ( );
        System.out.println (size );

        for(int i=0;i <size; i++){
            String optionText= allOptions.get( i ).getText();
            System.out.println (optionText );
            select.selectByIndex ( i );
            Thread.sleep ( 2000 );
        }


    }

}