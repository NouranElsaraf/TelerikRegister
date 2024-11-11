package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import utils.MethodHandles;

public class RegisterConfirmationPage extends MethodHandles{

    public RegisterConfirmationPage(WebDriver driver) {
        super(driver);
    }
    private final By thankYouConfirmation = By.xpath("//h1[@class='u-mb2']");

    public String accountCreatedConfirmationMessage(){
       return(getText(thankYouConfirmation,20));
    }
}
