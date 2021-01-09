package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

// chrome driver
System.setProperty("webdriver.chrome.driver","C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver (  );
       driver.get("https://www.facebook.com/"); // browser
      //  driver.findElement ( By.className ( "inputtext") ).sendKeys ( "helloworld" );
        //driver.findElement ( By.id ( "email" ) ).sendKeys ( "This is my first code" );
       // driver.findElement ( By.name ( "pass" ) ).sendKeys ( "123456" );
     //   driver.findElement ( By.linkText ( "Forgot account?" ) ).click ();

        driver.findElement (By.cssSelector ( "#email" )  ).sendKeys ( "emailaddress" );
driver.findElement ( By.xpath ("//*[@id='pass']"  ) ).sendKeys ("password");
driver.findElement ( By.xpath ( "//*[@id='u_0_a']/div[3]/a" ) ).click ();


}}
