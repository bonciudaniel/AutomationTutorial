package Tests;

import HelpMethods.ElementMethods;
import Objects.RegisterObject;
import Pages.IndexPages;
import Pages.RegisterPage;

import ShareData.Hooks;
import org.checkerframework.checker.units.qual.A;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class RegisterTest extends Hooks {

    @Test
    public void metodaTest() {
        RegisterObject registerObject = new RegisterObject(TestData);

        IndexPages indexPages = new IndexPages(getDriver());
        indexPages.clickSkipSignIn();
        TestReport.AttachedReport("pass","I click on  Sign button");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.RegisterProcess(registerObject);
        TestReport.AttachedReport("pass","Fill register form");

            }

        }

