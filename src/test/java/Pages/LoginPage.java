package Pages;

import HelpMethods.ElementMethods;
import Objects.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(css ="input[placeholder='E mail']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement parola;

    @FindBy(id="enterbtn")
    private WebElement Enter;

    @FindBy(id ="errormsg")
    private WebElement error;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void LoginInvalid(LoginObject loginObject){

        elementMethods.FilleElement(email,loginObject.getEmail());

        elementMethods.FilleElement(parola, loginObject.getPassword());

        elementMethods.ClickElement(Enter);

        elementMethods.ValidateElementText(error,loginObject.getMessage());

    }
}
