package Tests;

import Pages.CareersPage;
import Pages.Home;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestAutomation {

    private WebDriver driver;
    private Home useInsiderPage;
    private CareersPage careersPage;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        useInsiderPage = new Home(driver);
        careersPage = new CareersPage(driver);
    }

    @Test
    void useinsiderTest() {
        useInsiderPage.navigateToUseInsider();
        useInsiderPage.navigateToCareers();
        careersPage.scrollToTeams();
        careersPage.viewAllTeams();
        careersPage.scrollThroughTeams();
        careersPage.clickNextArrow(25);
        careersPage.openLifeAtInsider();
        careersPage.applyForJob("Istanbul, Turkiye", "Quality Assurance");
    }

    @AfterEach
    void tearDown() {
        driver.close();
    }
}

