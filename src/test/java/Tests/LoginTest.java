package Tests;

import HelpMethods.ElementMethods;
import Objects.LoginObject;
import Pages.IndexPages;
import Pages.LoginPage;
import ShareData.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends Hooks {




    @Test
    public void metodaTest(){


        LoginObject loginObject = new LoginObject(TestData);


        IndexPages indexPages = new IndexPages(getDriver());
        indexPages.clickSignIn();
        TestReport.AttachedReport("pass","I click on  Sign button");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.LoginInvalid(loginObject);
        TestReport.AttachedReport("pass","I manage to validate invalid login");



    }

}
