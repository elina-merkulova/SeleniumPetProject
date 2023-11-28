package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public WebElement findElement(By locator) {

        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {

        return driver.findElements(locator);
    }

    public double parseStringToDouble(String a) {
        return Double.parseDouble(a);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void fillInField(By locator, String string) {
        try {
            driver.findElement(locator).sendKeys(string);
        } catch (ElementNotInteractableException e) {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
    }

    public String getElementText(By locator) {
        return driver.findElement(locator).getText();
    }
}
