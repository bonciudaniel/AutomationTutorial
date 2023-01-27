package Tests;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import HelpMethods.WindowMethods;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends ShareData {





    @Test
    public void MetodaTest(){

        ElementMethods element = new ElementMethods(getDriver());
        PageMethods element = new PageMethods(getDriver());
        WindowMethods element = new WindowMethods(getDriver());



        WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
       element.clickElement(SkipRegister);


        WebElement SwitchToElement = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));

        element.moveSpecificTabWindow(SwitchToElement);

        WebElement clickWindows = getDriver().findElement(By.xpath("//a[text()='Windows']"));
       element.ClickElement(clickWindows);


        element.navigateToPage("https://demo.automationtesting.in/Windows.html");

        List<WebElement>WindowOptions = getDriver().findElements(By.cssSelector(".nav-stacked>li>a"));
        WindowOptions.get(0).click();

        element.clickElement(windowOption.get(0));
        WebElement btn1 = getDriver().findElement(By.cssSelector(">a>button"));
        element.ClickElement(btn1);


        //Identificam multimea de taburi/Windows-uri
        //Ne mutam cu focus-ul pe un tab specific
       element.moveSpecificTabWindow(1);
       element.closeCurentTabsWindows();
       element.moveSpecificTabWindow(0);



        //Inchidem tabul curent
        getDriver().close();
        getDriver().switchTo().window(browserTabs.get(0));

        WindowOptions.get(1).click();
        WebElement btn2 = getDriver().findElement(By.cssSelector("#Separate>button"));
        element.clickElement(btn2);

        List<String>Windows=new ArrayList<>(getDriver().getWindowHandles());
        //Ne mutam cu foscus-ul pe un window specific
        element.moveSpecificTabWindow(1);
        element.closeCurentTabsWindows();
      element.moveSpecificTabWindow(0);

        WindowOptions.get(2).click();
        WebElement btn3 = getDriver().findElement(By.cssSelector("#Multiple>button"));
        element.clickElement(btn3);

        element.moveSpecificTabWindow(2);
        element.closeCurentTabsWindows();
        element.moveSpecificTabWindow(1);
        element.closeCurentTabsWindows();
        element.moveSpecificTabWindow(0);





    }
}
