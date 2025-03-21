package Pages;

import org.openqa.selenium.WebDriver;

public class UseInsiderPage extends page{
    public final String myCompany = "//a[contains(.,'Company')]";
    public final String myCareers = "//a[.='Careers']";

    public UseInsiderPage(WebDriver driver){
        super(driver);
    }


}
