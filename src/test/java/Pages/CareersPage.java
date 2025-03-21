package Pages;

import org.openqa.selenium.WebDriver;

public class CareersPage extends page{

    public final String allTeams = "//a[.='See all teams']";

    public CareersPage(WebDriver driver){
        super(driver);
    }
}
