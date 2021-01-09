package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploader {
    public static void main(String[] args) {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "https://the-internet.herokuapp.com/upload" );

        WebElement fileUploadLink= driver.findElement ( By.linkText("File Upload") );
        fileUploadLink.click ();
        WebElement chooseFile= driver.findElement ( By.id("file-upload") );
        chooseFile.sendKeys ( "C:/Users/chris/OneDrive/Desktop/TESTNG.xlsx" );
WebElement uploadButton = driver.findElement ( By.id ( "file-submit" ));
uploadButton.click ();
    }
}