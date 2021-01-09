package class09;

import Class07.main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesWithPagination {


        public static String url = "http://syntaxtechs.com/selenium-practice/table-pagination-demo.php";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\chris\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            driver.navigate().to(url);
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class = 'table table-hover']/tbody/tr"));
            WebElement nextButton = driver.findElement(By.xpath("//a[@class = 'next_link']"));
            boolean flag = true;

            while(flag) {
                for(WebElement row : tableRows) {
                    String rowText = row.getText();
                    if(rowText.contains("Archy J")) {
                        flag = false;
                        System.out.println(rowText);
                        break;
                    }
                }
                nextButton.click();
            }

            driver.quit();

        }
}
