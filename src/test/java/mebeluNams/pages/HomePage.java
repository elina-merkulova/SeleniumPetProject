package mebeluNams.pages;

import org.openqa.selenium.By;
import utils.BasePage;

public class HomePage {
    private BasePage basePage;
    private final By MANS_KONTS_BTN = By.xpath(".//div[@class = 'wd-header-my-account wd-tools-element wd-event-hover wd-design-7 wd-account-style-icon login-side-opener wd-tools-custom-icon whb-g8wwwjd00t47vm5sdbla']");

    public HomePage(BasePage basePage) {
        this.basePage = basePage;
    }
    public void openRegistrationPage(){
        basePage.click(MANS_KONTS_BTN);
    }
}
