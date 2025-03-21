package Pages;

import org.openqa.selenium.WebDriver;

public class OpenPositionsPage extends page{
    public final String allPositions = ".py-sm-3";
    public final String viewroles = "//a[@href='https://jobs.lever.co/useinsider/f06a3f84-3a0c-4190-8b78-517b9adc981c']";

    public OpenPositionsPage(WebDriver driver) {
        super(driver);
    }
}
