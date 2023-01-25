package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsMethods {
    private WebDriver driver;

    public AlertsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void AcceptAlert(){
        WaitAlert();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void DismissAlert() {
        WaitAlert();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void FillAlert(String Value, boolean MakeDecission) {
        WaitAlert();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(Value);
        if (MakeDecission){
            alert.accept();
        }
        else {
            alert.dismiss();
        }
    }

    private void WaitAlert(){
        WebDriverWait WaitExplicit = new WebDriverWait(driver, Duration.ofSeconds(10)) ;
        WaitExplicit.until(ExpectedConditions.alertIsPresent());
    }
}
