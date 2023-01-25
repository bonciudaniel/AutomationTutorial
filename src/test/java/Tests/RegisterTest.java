package Tests;

import HelpMethods.ElementMethods;
import ShareData.ShareData;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterTest extends ShareData {

    @Test
    public void metodaTest(){

        ElementMethods elementMethods = new ElementMethods(getDriver()) ;




        WebElement SignIn = getDriver().findElement(By.id("btn1"));
       elementMethods.ClickElement(SignIn);

        WebElement SkipRegister= getDriver().findElement(By.id("btn2"));
        SkipRegister.click();

        WebElement FirstName = getDriver().findElement(By.cssSelector("input[placeholder='First Name']"));
        String FirstNameValue = "Daniel" ;
        elementMethods.FilleElement(FirstName, FirstNameValue);

        WebElement LastName = getDriver().findElement(By.xpath("//input[@placeholder='Last Name']"));
        String LastNameValue = "Bonciu" ;
        elementMethods.FilleElement(LastName, LastNameValue);

        WebElement Adress= getDriver().findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String AdressValue = "Brasov" ;
        elementMethods.FilleElement(Adress,AdressValue);

        WebElement Email= getDriver().findElement(By.xpath("//input[@ng-model='EmailAdress']"));
        String EmailValue = "dani@gmail.com" ;
        elementMethods.FilleElement(Email,EmailValue);

        WebElement Telefon= getDriver().findElement(By.xpath("//input[@ng-model='Phone']"));
        String TelefonValue = "255522454" ;
        elementMethods.FilleElement(Telefon, TelefonValue);

        WebElement Gen = getDriver().findElement(By.xpath("//input[@value='Male']"));
        elementMethods.ClickElement(Gen);

        WebElement Hobby = getDriver().findElement(By.id("checkbox2"));
        elementMethods.ClickElement(Hobby);



        //Interactionam cu un drop down clasic >select
        WebElement Skills = getDriver().findElement(By.id("Skills"));
        elementMethods.SelectElementText(Skills,"Java");

        WebElement Year = getDriver().findElement( By.id("yearbox"));
        elementMethods.SelectElementValue(Year, "1997");

        elementMethods.ScrollByPixel(0 ,300);


        WebElement LanguageElement = getDriver().findElement(By.id("msdd"));
         elementMethods.ClickElement(LanguageElement);

         //Interactionam cu o multime de elemente (drop down complex)

         List<WebElement> LanguageOptions= getDriver().findElements(By.cssSelector(".ui-autocomplete>li>a"));
         String ExpectedLanguage = "English" ;
         for (Integer index=0 ; index < LanguageOptions.size(); index ++){
             if (LanguageOptions.get(index).getText().equals(ExpectedLanguage)){
                 elementMethods.ClickElement(LanguageOptions.get(index));
             }
         }

        elementMethods.ClickElement(Gen);



         WebElement SelectCountry = getDriver().findElement( By.cssSelector(".select2-selection"));
       elementMethods.ClickElement(SelectCountry);
         WebElement SelectCountryInput = getDriver().findElement(By.className("select2-search__field"));
        elementMethods.FilleElement(SelectCountryInput, "Australia");


        WebElement Month = getDriver().findElement(By.cssSelector("select[placeholder= 'Month']"));
        elementMethods.SelectElementText(Month, "August");

        WebElement Day = getDriver().findElement(By.id("daybox"));
        elementMethods.SelectElementValue(Day, "15");

        WebElement FirstPassword = getDriver().findElement(By.id("firstpassword"));
        String firstPasswordValue = "Dani" ;
       elementMethods.FilleElement(FirstPassword, FirstNameValue);

        WebElement ConfirmPassword = getDriver().findElement(By.id("secondpassword"));
        String confirmPasswordValue = "Daniel";
        elementMethods.FilleElement(ConfirmPassword,confirmPasswordValue);

        WebElement Submit = getDriver().findElement(By.id("submitbtn"));
        elementMethods.ClickElement(Submit );

    }
}
