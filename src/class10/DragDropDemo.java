package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {


    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver ();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement( By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        //action.dragAndDrop(draggable, droppable).perform();
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
    }
}

