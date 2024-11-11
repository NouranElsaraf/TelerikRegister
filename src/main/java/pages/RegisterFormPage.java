package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class RegisterFormPage extends MethodHandles {
    public RegisterFormPage(WebDriver driver) {
        super(driver);
    }
    private final By passwordField =By.cssSelector("#password");
    private final By firstNameField =By.cssSelector("#fist-name");
    private final By lastNameField =By.cssSelector("#last-name");
    private final By companyField =By.cssSelector("#company");
    private final By phoneField =By.cssSelector("#phone");
    private final By countryField =By.xpath("//input[@aria-invalid='true']");
    private final By createAccountBtn =By.cssSelector("button[type='submit']");

    public void insertPasswordInput(String password){
        sendKeys(passwordField,7,password);
    }

    public void insertFirstNameInput(String firstName){
        sendKeys(firstNameField,3,firstName);
    }

    public void insertLastName(String lastName){
        sendKeys(lastNameField,3,lastName);
    }

    public void insertCompany(String company){
        sendKeys(companyField,3,company);
    }

    public void insertPhone(String phone){
        sendKeys(phoneField,3,phone);
    }

    public void insertCountry(String country){
        tabSendKeys(countryField,15,country,Keys.ENTER);
    }

    public RegisterConfirmationPage clickOnCreateAccount() throws InterruptedException {
        moveToElement(createAccountBtn,20);
        Thread.sleep(1000);
        click(createAccountBtn,3);
        return new RegisterConfirmationPage(driver);
    }
//test register
    public void enterFields(String password,String firstName,String lastName,String company,String phone,String country){
       insertPasswordInput(password);
       insertFirstNameInput(firstName);
       insertLastName(lastName);
       insertCompany(company);
       insertPhone(phone);
       insertCountry(country);
    }
}
