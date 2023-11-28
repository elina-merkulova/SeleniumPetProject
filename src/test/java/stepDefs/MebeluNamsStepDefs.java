package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mebeluNams.pages.HomePage;
import mebeluNams.pages.RegistrationPage;
import utils.BasePage;

public class MebeluNamsStepDefs {
    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage(basePage);
    RegistrationPage registrationPage = new RegistrationPage(basePage);
    private final String URL = "mebelunams.lionssolution.com";

    @Given("client opens webpage")
    public void open_SUT() {
        basePage.openUrl(URL);
    }

    @Given("registration page is open")
    public void open_registration_page() {
        homePage.openRegistrationPage();
    }

    @When("client enters {string} into email field and {string} into password field")
    public void fill_in_field(String emailValue, String passwordValue) {
        registrationPage.chooseRegistrationOption();
        registrationPage.fillInEmailField(emailValue);
        registrationPage.fillInPasswordField(passwordValue);
    }

    @When("client submits registration form")
    public void submit_registration_form() {
        registrationPage.submitRegistrationForm();
    }
    @Then("{string} password message should be {string}")
    public void check_error_message(String passwordQuality, String expectedMessage){
        registrationPage.checkPasswordErrorMessage(passwordQuality, expectedMessage);
    }

    @After("@all")
    public void close_browser() {
        basePage.closeBrowser();
    }
}
