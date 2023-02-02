package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {

    private WebDriver driver;

    public  WindowMethods(WebDriver driver) {this.driver = driver;}

    public void moveSpecificTabWindow(Integer index){
        List<String> Multiple=new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(Multiple.get(index));
    }

    public void closeCurentTabsWindows(){

    }

    public void clickElement(WebElement skipRegister) {
    }
}
