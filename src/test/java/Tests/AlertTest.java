package Tests;

import Pages.AlertPage;
import Pages.IndexPages;
import Pages.RegisterPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class AlertTest extends ShareData {



    @Test
    public void metodaTest() {
        IndexPages indexPages = new IndexPages(getDriver());
        indexPages.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToAlert();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactAlertAccept();
        alertPage.interactAlertDismiss();
        alertPage.interactAlertValue("ceva");

    }
}

