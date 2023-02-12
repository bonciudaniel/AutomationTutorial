package Tests;

import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import Objects.FrameObject;
import Pages.FramePage;
import Pages.IndexPages;
import Pages.RegisterPage;

import ShareData.Hooks;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class FramesTest extends Hooks {
    @Test
    public void MetodaTest()  {

        FrameObject frameObject = new FrameObject(TestData);

        IndexPages indexPages = new IndexPages(getDriver());
        indexPages.clickSkipSignIn();
        TestReport.AttachedReport("pass","Click SkipSignIn button");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToFrame();
        TestReport.AttachedReport("pass","Go to frame");

        FramePage framePage = new FramePage(getDriver());
        framePage.MultipleFrame(FrameObject);
        framePage.SingleFrame(FrameObject);
        TestReport.AttachedReport("pass","Mange Multiple Frames");



    }


}