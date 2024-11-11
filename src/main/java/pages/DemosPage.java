package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class DemosPage extends MethodHandles {
    public DemosPage(WebDriver driver) {
        super(driver);
    }

    private final By freeTrialBtn = By.xpath("//a[@class='TK-Button TK-Button--CTA']");

    public AllProductsPage clickOnFreeTrialBtn(){
        click(freeTrialBtn , 3);
        return new AllProductsPage(driver);
    }



}
