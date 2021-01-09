package Review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleWindows {
    public static void main(String[] args) throws InterruptedException {

        /*
        How to handle windows in Selenium
        Handle web tables
        Handle Claenders

        What is an alert --- popup windows which attracts our attention to something important
        how to handle alerts-- switchTo() command
        accpet cancel /deny, sendText(). getText()


        iFrame -- inline Frame --- Frame or window inside another window
        how to handle iFrame --- switchTo()

        WIndows Handlig

         */

            System.setProperty( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver ();
            driver.manage ().window ().maximize ();

            driver.get ("http://http://syntaxtechs.com/selenium-practice/index.php"  );

            driver.findElement ( By.linkText ("Alerts & Modals" ) ).click ();
            driver.findElement ( By.linkText ( "Window Popup Modal" ) ).click ();


            String parentHandle= driver.getWindowHandle ();

            System.out.println ("Parent window handle: " + parentHandle );


            driver.findElement ( By.linkText ( "Follow On Instagram" ) ).click ();

            Set<String> handles = driver.getWindowHandles ();

            Iterator<String> handleIt= handles.iterator ( );

            parentHandle= handleIt.next ();


        System.out.println (parentHandle );


Thread.sleep ( 2000 );
        }
}
