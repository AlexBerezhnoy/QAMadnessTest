package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final By LOGIN_BUTTON = By.cssSelector("[id='login-bt']");

    public LoginPage clickLoginButton() {
        $(LOGIN_BUTTON).click();
        return new LoginPage();
    }
}


