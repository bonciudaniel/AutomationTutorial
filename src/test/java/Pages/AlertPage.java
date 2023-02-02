package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> AlertOptions;

    @FindBy(css = "#OKTab>button")
     private WebElement btn1;

    @FindBy(css = "#CancelTab>button")
    private WebElement btn2;

    @FindBy(css = "#Textbox>button")
    private WebElement btn3;

    public void interactAlertAccept(){

        elementMethods.ClickElement( AlertOptions.get(0));
        elementMethods.ClickElement(btn1);
        alertsMethods.AcceptAlert();

    }

    public void interactAlertDismiss(){
        elementMethods.ClickElement( AlertOptions.get(1));
        elementMethods.ClickElement(btn2);
        alertsMethods.DismissAlert();

    }
    public void interactAlertValue(String value){
        elementMethods.ClickElement( AlertOptions.get(2));
        elementMethods.ClickElement(btn3);

        alertsMethods.FillAlert(value,true);
    }
}
