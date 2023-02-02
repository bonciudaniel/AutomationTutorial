package Pages;

import HelpMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;

    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public AlertsMethods alertsMethods;
    public FrameMethods frameMethods;
    public WindowMethods windowMethods;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);
        alertsMethods = new AlertsMethods(driver);
        frameMethods = new FrameMethods(driver);
        windowMethods = new WindowMethods(driver);
    }
}
