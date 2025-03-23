package Pages;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends BasePage {

    public CareersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='See all teams']")
    private WebElement seeAllTeamsButton;

    @FindBy(css = ".icon-arrow-right")
    private WebElement arrowRightButton;

    @FindBy(xpath = "//span[contains(@class, 'select2-selection__rendered')]")
    private WebElement locationFilter;

    @FindBy(xpath = "//li[contains(text(), 'Istanbul, Turkiye')]")
    private WebElement istanbulOption;

    @FindBy(id = "select2-filter-by-department-container")
    private WebElement departmentFilter;

    @FindBy(xpath = "//li[contains(text(), 'Quality Assurance')]")
    private WebElement qaOption;

    @FindBy(xpath = "//p[contains(.,'Software QA Tester / Intercontinental Support - Insider Testinium Tech Hub (Remo')]")
    private WebElement jobPost;

    @FindBy(xpath = "//div[@class='swiper-slide swiper-slide-next']/div[@class='elementor-carousel-image']")
    private WebElement slider;

    @FindBy(xpath = "//div[@class='swiper-wrapper']/div[7]/div[@class='elementor-carousel-image']")
    private WebElement slider2;

    @FindBy(xpath = "//a[@href='https://jobs.lever.co/useinsider/f06a3f84-3a0c-4190-8b78-517b9adc981c']")
    private WebElement jobElement;

    @FindBy(css = ".py-sm-3")
    private WebElement viewJobs;

    public void scrollToTeams() {
        scrollByPixelsWithParameters(250, 12, 1000);
    }

    public void viewAllTeams() {
        clickElement(seeAllTeamsButton);
        waitLoading(2000);
    }

    public void scrollThroughTeams() {
        scrollByPixelsWithParameters(250, 13, 1000);
        scrollByPixelsWithParameters(65, 1, 1000);
    }

    public void openLifeAtInsider() {

        scrollByPixelsWithParameters(700, 1, 2000);
        scrollByPixelsWithParameters(500, 1, 2000);
        clickElement(slider);
        clickElement(slider);
    }

    public void applyForJob(String location, String department) {

        scrollByPixelsWithParameters(1200, 1, 1000);
        clickElement(viewJobs);
        waitLoading(5000);
        scrollByPixelsWithParameters(300, 1, 17000);
        clickElement(locationFilter);
        waitLoading(3000);
        clickElement(istanbulOption);
        waitLoading(5000);
        clickElement(departmentFilter);
        waitLoading(3000);
        scrollToElement(qaOption);
        waitLoading(3000);
        clickElement(qaOption);
        waitLoading(5000);
        scrollByPixels(50);
        waitLoading(2000);
        clickElement(jobPost);
        waitLoading(2000);
        clickElement(jobElement);
        waitLoading(10000);
    }

    public void clickNextArrow(int times) {
        for (int i = 0; i < times; i++) {
            clickElement(arrowRightButton);
        }
    }
}