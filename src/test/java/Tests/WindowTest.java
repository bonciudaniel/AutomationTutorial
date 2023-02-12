package Tests;

import Pages.IndexPages;
import Pages.RegisterPage;
import Pages.WindowPage;

import ShareData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {





    @Test
    public void MetodaTest(){





      IndexPages indexPages = new IndexPages(getDriver());
      indexPages.clickSkipSignIn();
        TestReport.AttachedReport("pass","I click on  Sign button");

      RegisterPage registerPage = new RegisterPage(getDriver());
      registerPage.goToWindow();
        TestReport.AttachedReport("pass","Go to window");

      WindowPage windowPage = new WindowPage(getDriver());
      windowPage.TabProcess();
      windowPage.WindowProcess();
      windowPage.TabsProcess();
        TestReport.AttachedReport("pass","Manage Tabs and Windows");


















    }
}
