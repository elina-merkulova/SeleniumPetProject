package mebeluNams.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BasePage;
import utils.ClientData.ClientData;

public class RegistrationPage {
    private final By SWITCH_TO_REGISTRATION_BTN = By.xpath(".//a[@class = 'btn wd-switch-to-register']");
    private final By EMAIL_FIELD = By.id("reg_email");
    private final By PASSWORD_FIELD = By.id("reg_password");
    private final By SUBMIT_BTN = By.xpath(".//button[@class='woocommerce-Button button']");
    private final By VERY_WEEK_PASSWORD_MESSAGE = By.xpath(".//div[@class='woocommerce-password-strength short']");
    private final By WEEK_PASSWORD_MESSAGE = By.xpath(".//div[@class='woocommerce-password-strength bad']");
    private final By MEDIUM_PASSWORD_MESSAGE = By.xpath(".//div[@class='woocommerce-password-strength good']");
    private final By STRONG_PASSWORD_MESSAGE = By.xpath(".//div[@class='woocommerce-password-strength strong']");

    BasePage basePage;
    ClientData clientData = new ClientData();

    public RegistrationPage(BasePage basePage) {
        this.basePage = basePage;
    }

    public void chooseRegistrationOption() {
        basePage.click(SWITCH_TO_REGISTRATION_BTN);
    }

    public void fillInEmailField(String email) {
        switch (email) {
            case "too long email" -> basePage.fillInField(EMAIL_FIELD, clientData.getToLongEmail());
            case "email without @" -> basePage.fillInField(EMAIL_FIELD, clientData.getInvalidEmail());
            default -> basePage.fillInField(EMAIL_FIELD, clientData.getClientEmail());
        }
    }

    public void fillInPasswordField(String password) {
        switch (password) {
            case "very week" ->
                    basePage.fillInField(PASSWORD_FIELD, clientData.getPasswordVeryShort());
            case "week" ->
                    basePage.fillInField(PASSWORD_FIELD, clientData.getPasswordShort());
            case "medium" ->
                    basePage.fillInField(PASSWORD_FIELD, clientData.getPasswordMedium());
            case "strong" ->
                    basePage.fillInField(PASSWORD_FIELD, clientData.getPasswordStrong());

            default -> basePage.fillInField(PASSWORD_FIELD, "PasswordPassword1!");
        }
    }

    public void submitRegistrationForm() {
        basePage.click(SUBMIT_BTN);
    }

    public void checkPasswordErrorMessage(String passwordQuality, String expectedMessage) {
        switch (passwordQuality) {
            case "very week" ->
                    Assert.assertEquals("Actual message doesen't match expected message", basePage.getElementText(VERY_WEEK_PASSWORD_MESSAGE), expectedMessage);
            case "week" ->
                    Assert.assertEquals("Actual message doesen't match expected message", basePage.getElementText(WEEK_PASSWORD_MESSAGE), expectedMessage);
            case "medium" ->
                    Assert.assertEquals("Actual message doesen't match expected message", basePage.getElementText(MEDIUM_PASSWORD_MESSAGE), expectedMessage);
            case "strong" ->
                    Assert.assertEquals("Actual message doesen't match expected message", basePage.getElementText(STRONG_PASSWORD_MESSAGE), expectedMessage);
        }
    }

}
