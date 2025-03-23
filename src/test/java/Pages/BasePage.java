package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor jsExecutor;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    protected void clickElement(WebElement element) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.click();
    }

    protected void scrollByPixels(int pixels) {
        jsExecutor.executeScript("window.scrollBy(0, " + pixels + ");");
    }

    protected void scrollByPixelsWithParameters(int pixels, int times, int wait) {
        for (int i = 0; i < times; i++) {
            jsExecutor.executeScript("window.scrollBy(0, " + pixels + ");");
            if(wait > 0){
                try {
                    Thread.sleep(wait);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    protected void scrollToElement(WebElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    protected void waitForPageLoad() {
        jsExecutor.executeScript("return document.readyState").equals("complete");
    }

    protected void waitLoading(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}