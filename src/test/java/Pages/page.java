package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class page {

    WebDriver driver;

    public page(WebDriver driver){
        this.driver = driver;
    }
    public void scroll(String myCareers) throws InterruptedException {
        JavascriptExecutor viewTeams = (JavascriptExecutor) driver;
        viewTeams.executeScript("window.scrollBy(0, 2000);");
        Thread.sleep(1000);
    }
}
