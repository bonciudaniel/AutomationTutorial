package Tests;

import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import Pages.FramePage;
import Pages.IndexPages;
import Pages.RegisterPage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FramesTest extends ShareData {
    @Test
    public void MetodaTest()  {

        IndexPages indexPages = new IndexPages(getDriver());
        indexPages.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToFrame();

        FramePage framePage = new FramePage(getDriver());
        framePage.SingleFrame("test");
        framePage.MultipleFrame("another test");



    }


}