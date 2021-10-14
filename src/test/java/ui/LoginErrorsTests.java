package ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

@Feature("Authorization feature")
@Story("Login story")
public class LoginErrorsTests extends BaseTest{
    private MainPage mainPage = new MainPage();
    private LoginPage loginPage = null;

    @BeforeMethod
    private void openLoginPage() {
        loginPage = mainPage.clickLoginButton();
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Test
    public void emptyPasswordTest() {
        loginPage.inputEmail("poiop");
        loginPage.inputPassword("");
        loginPage.clickSingInButton();
        loginPage.isErrorPopupDisplayingRight("Поле \"Пароль\" обязательно к заполнению.");
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Test
    public void emptyLoginTest() {
        loginPage.inputEmail("poiop");
        loginPage.inputPassword("poiop");
        loginPage.clickSingInButton();
        loginPage.isErrorPopupDisplayingRight("Эти учетные данные не соответствуют нашим записям.");
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Test
    public void incorrectDataTest() {
        loginPage.inputEmail("");
        loginPage.inputPassword("poiop");
        loginPage.clickSingInButton();
        loginPage.isErrorPopupDisplayingRight("Поле \"E-mail\" обязательно к заполнению.");
    }
}

