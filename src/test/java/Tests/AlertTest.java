package Tests;

import Objects.AlertObject;
import Pages.AlertPage;
import Pages.IndexPages;
import Pages.RegisterPage;

import ShareData.Hooks;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {



    @Test
    public void metodaTest() {

        AlertObject AlertObject = new AlertObject(TestData);



        IndexPages indexPages = new IndexPages(getDriver());
        indexPages.clickSkipSignIn();
        TestReport.AttachedReport("pass","Click SkipSignIn button");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToAlert();
        TestReport.AttachedReport("pass","Go To Alert");

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactAlertAccept();
        alertPage.interactAlertDismiss();
        alertPage.interactAlertValue(AlertObject);
        TestReport.AttachedReport("pass","Manage to Close Multiple Alerts Type");

    }
}

