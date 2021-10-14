package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final By SINGIN_BUTTON = By.cssSelector("button[type='submit']");
    private final By emailInputField = By.cssSelector("input[id='form-account-sing-in-modal-email_or_name']");
    private final By passwordInputField = By.cssSelector("input[id='form-account-sing-in-modal-password']");
    private final By upErrors = By.cssSelector("div[id='popup_content'] div");
    private final By closePopupWithError = By.cssSelector("div[id='popup_close']");
    private final By namePopupWithError = By.cssSelector("div[id='popup_title']");

    public MainPage login(String email, String password) {
        System.out.println("Login as user");
        inputEmail(email);
        inputPassword(password);
        return clickSingInButton();
    }

    public void inputEmail(String email) {
        $(emailInputField).setValue(email);
    }

    public void inputPassword(String password) {
        $(passwordInputField).setValue(password);
    }

    public MainPage clickSingInButton() {
        $(SINGIN_BUTTON).click();
        return new MainPage();
    }

    public void isErrorPopupDisplayingRight (String errorText) {
        $(namePopupWithError).shouldHave(Condition.exactText("Ошибка!"));
        $(upErrors).shouldHave(Condition.exactText(errorText));
    }

    public LoginPage closeErrorsPopup() {
         $(closePopupWithError).click();
        inputEmail("");
        inputPassword("");
        return new LoginPage();
    }
}
