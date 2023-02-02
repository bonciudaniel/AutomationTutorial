package Pages;

import HelpMethods.WindowMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WindowPage extends BasePage{
    public WindowPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> WindowOptions;

    @FindBy(css = "#Tabbed>a>button")
    private WebElement TabButton;

    @FindBy(css = "#Separate>button")
    private WebElement WindowButton;

    @FindBy(css = "#Multiple>button")
    private WebElement MultipleButton;

    public void TabProcess() {

        elementMethods.ClickElement(WindowOptions.get(0));
        elementMethods.ClickElement(TabButton);
        windowMethods.moveSpecificTabWindow(1);
        windowMethods.closeCurentTabsWindows();
        windowMethods.moveSpecificTabWindow(0);



    }
    public void WindowProcess(){
        WindowOptions.get(1).click();
        elementMethods.ClickElement(WindowButton);
        windowMethods.moveSpecificTabWindow(1);
        driver.close();
        windowMethods.moveSpecificTabWindow(0);

    }
     public void TabsProcess(){
         WindowOptions.get(2).click();
         elementMethods.ClickElement(MultipleButton);
         windowMethods.moveSpecificTabWindow(2);
         windowMethods.closeCurentTabsWindows();
         windowMethods.moveSpecificTabWindow(1);
         windowMethods.closeCurentTabsWindows();
         windowMethods.moveSpecificTabWindow(0);
     }

}
