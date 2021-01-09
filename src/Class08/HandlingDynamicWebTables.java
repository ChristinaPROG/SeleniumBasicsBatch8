package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class HandlingDynamicWebTables {
    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";

    public static <WebElements> void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.navigate ( ).to ( url );

        WebElement username = driver.findElement ( By.id ( "ct100_MainContent_username" ) );
username.sendKeys ( "Tester" );
        WebElement password = driver.findElement ( By.id ( "ct100$MainContent$password" ) );
        password.sendKeys ( "test" );
        WebElement loginButton = driver.findElement ( By.className ( "button" ) );
        loginButton.click ();

       List<WebElement> rows= driver.findElements (By.xpath ("//table[@id='ct100_MainContent_orderGrid']/tbody/tr"  )  );
        for (int i = 1; i < rows.size (); i++) {
            String rowText = rows.get(i).getText();
            System.out.println (rowText );
            if ( rowText.contains ( "Bob Feather" ) ){
                driver.findElement ( By.xpath ( "//table[@id=‘ctl00_MainContent_orderGrid’]/tbody/tr/td[1]" ) );
            }

        }




    }
}