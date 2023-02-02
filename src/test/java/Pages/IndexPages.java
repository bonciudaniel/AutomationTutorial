package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPages extends BasePage{

    @FindBy(id="btn1")
    private WebElement SignIn;

    @FindBy(id = "btn2")
    private WebElement SkipRegister;

    public IndexPages(WebDriver driver) {
        super(driver);
    }

    //actiuni specifice pt IndexPage

    public void clickSignIn(){
        elementMethods.ClickElement(SignIn);
    }

    public void clickSkipSignIn(){
        elementMethods.ClickElement(SkipRegister);
    }
}
