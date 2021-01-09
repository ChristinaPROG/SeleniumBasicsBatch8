package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task {

        public static void main(String[] args) {
            String url = "https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp";
            WebDriver driver = new ChromeDriver ( );
            driver.get ( "http://uitestpractice.com/Students/Contact/" );
            driver.manage ( ).window ( ).maximize ( );
            driver.findElement ( By.linkText ( "This is a Ajax link" ) ).click ( );
            driver.manage ( ).timeouts ( ).implicitlyWait ( 30, TimeUnit.SECONDS );
            WebElement fr = driver.findElement ( By.xpath ( "//div[@class= 'ContactUs']/child::p" ) );
            fr.getText ( );
            System.out.println ( fr.getText ( ) );
            driver.manage ( ).timeouts ( ).implicitlyWait ( 2, TimeUnit.SECONDS );
            driver.close ( );
        }
    }

