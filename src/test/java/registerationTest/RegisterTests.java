package registerationTest;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AllProductsPage;
import pages.DemosPage;
import pages.LoginPage;
import pages.RegisterFormPage;

import java.io.FileNotFoundException;

public class RegisterTests extends BaseTest {
    @Test
    public void testRegisterFormWithValidData() throws FileNotFoundException, InterruptedException {
        allProductsPage= demosPage.clickOnFreeTrialBtn();
        Thread.sleep(30000);//to handle captcha
        allProductsPage.clickOnTryNowBtn();
        loginPage=allProductsPage.clickOnReactFromDD();
        Thread.sleep(10000);
        loginPage.enterEmailAddress(dataModel().Login.validCredentials.Email);
        RegisterFormPage registerFormPage=loginPage.clickOnNextBtn();

        registerFormPage.enterFields(dataModel().RegisterForm.validCredentials.password,
                dataModel().RegisterForm.validCredentials.firstName,
                dataModel().RegisterForm.validCredentials.lastName,
                dataModel().RegisterForm.validCredentials.company,
                dataModel().RegisterForm.validCredentials.phone,
                dataModel().RegisterForm.validCredentials.country);
        Thread.sleep(30000); // to handle captcha
        registerFormPage.clickOnCreateAccount();
    }


}

