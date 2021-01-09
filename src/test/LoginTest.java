package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import testbase.BaseClass;
import utilis.CommonMethods;

public class LoginTest {
    public static void main(String[] args) {
        BaseClass.setUp ( );
        LoginPage loginPage = new LoginPage ( );
        loginPage.usernameField.sendKeys ( "Admin" );
        loginPage.passwordField.sendKeys ( "Hum@nhrm123" );
        loginPage.loginButton.click ();

BaseClass.tearDown ();

    }
}