package Tests;

import HelpMethods.ElementMethods;
import Pages.IndexPages;
import Pages.RegisterPage;
import ShareData.ShareData;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterTest extends ShareData {

    @Test
    public void metodaTest() {

        IndexPages indexPages = new IndexPages(getDriver());
        IndexPages.cliskSkipSignIn();

        String FirstNameValue = "Daniel";
        String LastNameValue = "Bonciu";
        String AdressValue = "Brasov";
        String EmailValue = "dani@gmail.com";
        String TelefonValue = "255522454";
        String SkillsValue = "Java";
        String yearvalue = "1997";
        String ExpectedLanguage = "English";
        String countryValue = "Australia" ;
        String monthValue = "August" ;
        String dayValue = "15" ;
        String firstpasswordValue = "Daniel";
        String confirmPasswordValue = "Daniel";

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.RegisterProcess(FirstNameValue,LastNameValue,AdressValue,EmailValue,TelefonValue,SkillsValue,yearvalue,ExpectedLanguage,
                countryValue,monthValue,dayValue,firstpasswordValue,confirmPasswordValue);

            }

        }

