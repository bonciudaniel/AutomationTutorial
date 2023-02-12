package Objects;

import java.util.HashMap;

public class AlertObject {

    private String AlertText;

    public AlertObject(HashMap<String,String> TestData) {
        populateObject(TestData);
    }

    public String getAlertText() {
        return AlertText;
    }

    public void setAlertText(String alertText) {
        AlertText = alertText;
    }
    private void populateObject(HashMap<String,String> TestData){
        for (String Key: TestData.keySet()){
            switch (Key){
                case "AlertText" :
                    setAlertText(TestData.get(Key));
                    break;

            }
        }
    }
}
