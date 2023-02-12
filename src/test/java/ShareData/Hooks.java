package ShareData;

import ExtentUtility.ExtentReport;
import InputFile.PropertiesUtility;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hooks extends ShareData{

    public HashMap<String,String> TestData;
    private String TestName;

    //Implementam o logica de generare a unui singur raport pentru N teste

    public static ExtentReport ExtentReportUtility = new ExtentReport();
    public static List<Log>LogContext = new ArrayList<>();
    public ExtentReport TestReport ;


    @BeforeMethod
    public void prepareEnviroment(){
        Setup();
        TestName = this.getClass().getSimpleName();
        PropertiesUtility propertiesUtility = new PropertiesUtility(TestName);
        TestData = propertiesUtility.GetAllData();
        TestReport = new ExtentReport(TestName);

    }
    @AfterMethod
    public void clearEnviroment(ITestResult Result){

        //Trebuie sa tratam cazul cand cade un test
        if (Result.getStatus()==ITestResult.FAILURE){
            TestReport.AttachedReport("fail", Result.getThrowable().getMessage(),getDriver(),TestName);

        }
        //facem o logica care sa genereze raportul inainte sa inchida driverul
        TestReport.AttachedReport("Info","-- finish "+TestName +" test--");
        synchronized ( ExtentReportUtility){
            ExtentTest CurrentTest = ExtentReportUtility.getExtent().createTest(""+TestName+"- report");
        LogContext.addAll(TestReport.getTestReport().getModel().getLogs());
        for (Log log:LogContext){
            CurrentTest.getModel().getLogs().add(log);
            if (log.getStatus().equals(Status.FAIL)){
                CurrentTest.getModel().setStatus(Status.FAIL);
            }
        }
        ExtentReportUtility.getExtent().flush();
        LogContext.clear();
        }

        Clear();

    }
}
