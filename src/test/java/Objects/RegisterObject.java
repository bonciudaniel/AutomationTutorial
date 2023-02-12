package Objects;

import java.util.HashMap;

public class RegisterObject {

    private String FirstName;
    private String LastName;
    private String Adress;
    private String Email;
    private String Telefon;
    private String Planlanguage;
    private String Country;
    private String year;
    private String month;
    private String day;
    private String password;
    private String confirmPassword;
    private String ExpectedLanguage;


    public RegisterObject(HashMap<String, String> TestData) {
        populateObject(TestData);

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String telefon) {
        Telefon = telefon;
    }

    public String getPlanlanguage() {
        return Planlanguage;
    }

    public void setPlanlanguage(String planlanguage) {
        Planlanguage = planlanguage;
    }

    public String getAustralia() {
        return Country;
    }

    public void setCountry(String australia) {
        Country = australia;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getExpectedLanguage() {
        return ExpectedLanguage;
    }

    public void setExpectedLanguage(String expectedLanguage) {
        ExpectedLanguage = expectedLanguage;
    }

    private void populateObject(HashMap<String, String> TestData) {
        for (String Key : TestData.keySet()) {
            switch (Key) {
                case "FirstName":
                    setFirstName(TestData.get(Key));
                    break;
                case "LastName":
                    setLastName(TestData.get(Key));
                    break;
                case "Adress":
                    setAdress(TestData.get(Key));
                    break;
                case "Email":
                    setEmail(TestData.get(Key));
                    break;
                case "Telefon":
                    setTelefon(TestData.get(Key));
                    break;
                case "PlanLanguage":
                    setPlanlanguage(TestData.get(Key));
                    break;
                case "":
                    setLastName(TestData.get(Key));
                    break;
                case "Country":
                    setCountry(TestData.get(Key));
                    break;
                case "year":
                    setYear(TestData.get(Key));
                    break;
                case "month":
                    setMonth(TestData.get(Key));
                    break;
                case "day":
                    setDay(TestData.get(Key));
                    break;
                case "password":
                    setPassword(TestData.get(Key));
                    break;
                case "confirmPassword":
                    setConfirmPassword(TestData.get(Key));
                    break;
                case "ExpectedLanguage":
                    setExpectedLanguage(TestData.get(Key));
                    break;

            }
        }
    }



}












