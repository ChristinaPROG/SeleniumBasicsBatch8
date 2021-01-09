package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameReview {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        String url = "https://the-internet.herokuapp.com/";
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );
        driver.findElement ( By.linkText ( "Frames" ) ).click ( );
        driver.findElement ( By.linkText ( "iFrame" ) ).click ( );
        // We need to enter text into textbox
        // 1. We need to switch to the frame in three ways (id, or name/ WebElement/ index)
        driver.switchTo ( ).frame ( "mce_0_ifr" );
        WebElement textBox = driver.findElement ( By.xpath ( "//body[@id='tinymce']/p" ) );
        textBox.clear ( );
        textBox.sendKeys ( "Hello From Batch 8" );
        driver.switchTo ( ).defaultContent ( );
        Boolean isDisplayed = driver.findElement ( By.xpath ( "//img[contains(@alt, 'Fork')]" ) ).isDisplayed ( );
        if ( isDisplayed ) {
            System.out.println ( "Img is displayed. Test pass" );
        } else {
            System.out.println ( "Ims is not displayed. Test fail" );
        }
        Thread.sleep ( 3000 );
    }
}