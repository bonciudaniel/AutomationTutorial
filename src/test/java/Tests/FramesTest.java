package Tests;

import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FramesTest extends ShareData {
    @Test
    public void MetodaTest()  {

        ElementMethods element = new ElementMethods(getDriver());
        PageMethods WebElement = new PageMethods(getDriver()) ;
        FrameMethods FilleElement = new FrameMethods(getDriver());

        WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
        element.ClickElement(SkipRegister);



        //Wait explicit cu conditii diferite

        WebElement SwitchTo = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));



        //Mergem cu mouse-ul pe un anumit element
        element.MoveToElement(SwitchTo);


        WebElement FrameElement = getDriver().findElement(By.xpath("//a[text()='Frames']"));
        element.ClickElement(FrameElement);

        WebElement.NavigateToPage("https://demo.automationtesting.in/Frames.html");

        List<WebElement> FrameOptions = getDriver().findElements(By.cssSelector(".nav-tabs>li>a"));
        element.ClickElement(FrameOptions.get(0));


        //Ne mutam pe un Iframe
        FilleElement.SwitchFrame("singleframe");
        WebElement FirstFrame = getDriver().findElement(By.cssSelector("input[type='text']"));
        FirstFrame.sendKeys("test");


        FilleElement.SwitchDefault();
        element.ClickElement(FrameOptions.get(1));

        FilleElement.SwitchFrame(getDriver().findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        FilleElement.SwitchFrame(getDriver().findElement(By.cssSelector("iframe[src='SingleFrame.html']")));

        WebElement SecondFrame = getDriver().findElement(By.cssSelector("input[type='text']"));
        SecondFrame.sendKeys("test2");
        FilleElement.SwitchDefault();


    }


}