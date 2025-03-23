package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BasePage {

    public Home(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(.,'Company')]")
    private WebElement companyMenu;

    @FindBy(xpath = "//a[.='Careers']")
    private WebElement careersLink;

    public void navigateToUseInsider() {
        driver.get("https://useinsider.com");
        waitForPageLoad();
    }

    public void navigateToCareers() {
        clickElement(companyMenu);
        clickElement(careersLink);
    }
}