package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By emailAddressLogin =By.cssSelector("#email");
    private final By nextBtn= By.cssSelector("button[type='submit']");

    public void enterEmailAddress(String emailLogin){
        sendKeys(emailAddressLogin,20,emailLogin);
    }
    public RegisterFormPage clickOnNextBtn(){
        click(nextBtn,20);
        return new RegisterFormPage(driver);
    }
}
