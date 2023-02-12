package Objects;

import java.util.HashMap;

public class FrameObject {

    private String Firstframe;
    private String Secondframe;

    public FrameObject(HashMap<String, String> TestData) {
        populateObject(TestData);
    }

    public String getFirstframe(HashMap<String, String> TestData) {
        return Firstframe;
    }

    public void setFirstframe(String firstframe) {
        Firstframe = firstframe;
    }

    public String getSecondframe() {
        return Secondframe;
    }

    public void setSecondframe(String secondframe) {
        Secondframe = secondframe;
    }

    private void populateObject(HashMap<String, String> TestData) {
        for (String Key : TestData.keySet()) {
            switch (Key) {
                case "Firstframe":
                    setFirstframe(TestData.get(Key));
                    break;
                case "Secondframe":
                    setSecondframe(TestData.get(Key));
                    break;

            }
        }
    }
}
