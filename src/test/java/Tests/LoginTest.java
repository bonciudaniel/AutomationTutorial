package Tests;

import HelpMethods.ElementMethods;
import Pages.IndexPages;
import Pages.LoginPage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ShareData {




    @Test
    public void metodaTest(){


        IndexPages indexPages = new IndexPages(getDriver());
        indexPages.clickSignIn();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.LoginInvalid("dani@gmail.com" ,"Parola","Invalid User Name or PassWord ");



    }

}
