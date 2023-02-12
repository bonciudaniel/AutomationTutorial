package Pages;

import Objects.RegisterObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;
import java.net.IDN;
import java.util.List;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement SwitchTo;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement AlertElement;

    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement FrameElement;

    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement WindowElement;

    @FindBy(css = "input[placeholder='First Name']")
    private WebElement FirstName;

    @FindBy(xpath = "input[@placeholder='Last Name']")
    private WebElement LastName;
    @FindBy(css = "textarea[@ng-model='Adress']")
    private WebElement Adress;

    @FindBy(css = "input[@ng-model='EmailAdress']")
    private WebElement Email;

    @FindBy(xpath =  "input[@ng-model='Phone']")
    private WebElement Telefon;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement  Gen;
     @FindBy(id="checkbox2" )
     private WebElement Hobby;
     @FindBy(id = "Skills")
     private WebElement Skills;
     @FindBy(id = "yearbox")
     private WebElement Year;
     @FindBy(id = "msdd")
     private WebElement LanguageElement;
     @FindBy(css = ".ui-autocomplete>li>a")
     private List<WebElement> LanguageOptions;
      @FindBy(css = ".select2-selection")
      private WebElement SelectCountry;
      @FindBy(css = "select2-search__field")
      private WebElement SelectCountryInput;
      @FindBy(css = "select[placeholder= 'Month']")
      private WebElement Month;
      @FindBy(id = "daybox")
      private WebElement Day;
      @FindBy(id = "firstpassword")
      private WebElement FirstPassword;
      @FindBy(id = "secondpassword")
      private WebElement ConfirmPassword;
      @FindBy(id = "submitbtn")
      private WebElement Submit;


      public void RegisterProcess(RegisterObject registerObject){

          elementMethods.FilleElement(FirstName, registerObject.getFirstName());

          elementMethods.FilleElement(LastName, registerObject.getLastName());
          elementMethods.FilleElement(Adress, registerObject.getAdress());

          elementMethods.FilleElement(Email, registerObject.getEmail());

          elementMethods.FilleElement(Telefon, registerObject.getTelefon());


          elementMethods.SelectElementValue(Year, registerObject.getYear());

          elementMethods.ScrollByPixel(0 ,300);

          elementMethods.ClickElement(LanguageElement);

          for (Integer index=0 ; index < LanguageOptions.size(); index ++){
              if (LanguageOptions.get(index).getText().equals(registerObject)){
                  elementMethods.ClickElement(LanguageOptions.get(index));
              }
          }

          elementMethods.ClickElement(Gen);

          elementMethods.ClickElement(SelectCountry);
          elementMethods.FilleElement(SelectCountryInput);

          elementMethods.SelectElementText(Month, registerObject.getMonth());

          elementMethods.SelectElementValue(Day, registerObject.getDay());


          elementMethods.FilleElement(FirstPassword, registerObject.getExpectedLanguage());

          elementMethods.FilleElement(ConfirmPassword, registerObject.getConfirmPassword());

          elementMethods.ClickElement(Submit );


      }



    public void goToAlert(){

        elementMethods.MoveToElement(SwitchTo);
        elementMethods.ClickElement(AlertElement);
        pageMethods.NavigateToPage("https://demo.automationtesting.in/Alerts.html");

    }
    public void goToFrame() {

        elementMethods.MoveToElement(SwitchTo);
        elementMethods.ClickElement(FrameElement);
        pageMethods.NavigateToPage("https://demo.automationtesting.in/Frames.html");
    }
    public void goToWindow() {

        elementMethods.MoveToElement(SwitchTo);
        elementMethods.ClickElement(WindowElement);
        pageMethods.NavigateToPage("https://demo.automationtesting.in/Windows.html");
    }
}
