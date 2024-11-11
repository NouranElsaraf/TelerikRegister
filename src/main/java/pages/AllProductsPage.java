package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.MethodHandles;

public class AllProductsPage extends MethodHandles {
    public AllProductsPage(WebDriver driver) {
        super(driver);
    }

private final By tryNowBtn =By.cssSelector(".Dropdown-arrow");
private final By reactFromDropDown = By.cssSelector(".u-db[href='/try/kendo-react-ui']");


    public void clickOnTryNowBtn(){
        clickWithActions(tryNowBtn,20);
    }
    public LoginPage clickOnReactFromDD(){
        moveToElement(reactFromDropDown,3);
        click(reactFromDropDown,3);
        return new LoginPage(driver);
    }
}