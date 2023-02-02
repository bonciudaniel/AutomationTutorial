package Tests;

import Pages.IndexPages;
import Pages.RegisterPage;
import Pages.WindowPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class WindowTest extends ShareData {





    @Test
    public void MetodaTest(){





      IndexPages indexPages = new IndexPages(getDriver());
      indexPages.clickSkipSignIn();

      RegisterPage registerPage = new RegisterPage(getDriver());
      registerPage.goToWindow();

      WindowPage windowPage = new WindowPage(getDriver());
      windowPage.TabProcess();
      windowPage.WindowProcess();
      windowPage.TabsProcess();


















    }
}
