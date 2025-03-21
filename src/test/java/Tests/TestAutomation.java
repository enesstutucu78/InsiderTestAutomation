package Tests;

import Pages.CareersPage;
import Pages.UseInsiderPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class TestAutomation {

   private WebDriver driver;
   private UseInsiderPage useInsiderPage;
   private CareersPage careersPage;



    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        useInsiderPage = new UseInsiderPage(driver);
        careersPage = new CareersPage(driver);

    }

    @Test
    void useinsiderLogin() throws InterruptedException {

        driver.get("https://useinsider.com");
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[contains(.,'Company')]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[.='Careers']")).click();
        Thread.sleep(2000);


        JavascriptExecutor viewTeams = (JavascriptExecutor) driver;
        viewTeams.executeScript("window.scrollBy(0, 2000);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams1 = (JavascriptExecutor) driver;
        viewTeams1.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);


        JavascriptExecutor viewTeams2 = (JavascriptExecutor) driver;
        viewTeams2.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams3 = (JavascriptExecutor) driver;
        viewTeams3.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams4 = (JavascriptExecutor) driver;
        viewTeams4.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);


        driver.findElement(By.xpath("//a[.='See all teams']")).click();
        Thread.sleep(2000);

        JavascriptExecutor viewTeams5 = (JavascriptExecutor) driver;
        viewTeams5.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams6 = (JavascriptExecutor) driver;
        viewTeams6.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams7 = (JavascriptExecutor) driver;
        viewTeams7.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams8 = (JavascriptExecutor) driver;
        viewTeams8.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams9 = (JavascriptExecutor) driver;
        viewTeams9.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams10 = (JavascriptExecutor) driver;
        viewTeams10.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams11 = (JavascriptExecutor) driver;
        viewTeams11.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams12 = (JavascriptExecutor) driver;
        viewTeams12.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams13 = (JavascriptExecutor) driver;
        viewTeams13.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams14 = (JavascriptExecutor) driver;
        viewTeams14.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams15 = (JavascriptExecutor) driver;
        viewTeams15.executeScript("window.scrollBy(0, 250);");
        Thread.sleep(1000);


        JavascriptExecutor viewTeams16 = (JavascriptExecutor) driver;
        viewTeams16.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(1000);

        JavascriptExecutor viewTeams17 = (JavascriptExecutor) driver;
        viewTeams17.executeScript("window.scrollBy(0, 70);");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".icon-arrow-right")).click();
        Thread.sleep(3000);

        JavascriptExecutor lifeatInsider = (JavascriptExecutor) driver;
        lifeatInsider.executeScript("window.scrollBy(0, 700);");
        Thread.sleep(2000);


        JavascriptExecutor lifeatInsider1 = (JavascriptExecutor) driver;
        lifeatInsider1.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='swiper-slide swiper-slide-next']/div[@class='elementor-carousel-image']")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath("//div[@class='swiper-wrapper']/div[7]/div[@class='elementor-carousel-image']")).click();
        Thread.sleep(5000);


        JavascriptExecutor dreamJob = (JavascriptExecutor) driver;
        dreamJob.executeScript("window.scrollBy(0, 1200);");
        Thread.sleep(1000);



        driver.findElement(By.cssSelector(".py-sm-3")).click();
        Thread.sleep(5000);

        // driver.get("https://useinsider.com/careers/quality-assurance/");
        // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20L));
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='See all QA jobs']")));
        // driver.findElement(By.xpath("//a[text()='See all QA jobs']")).click();
        // Thread.sleep(1000);  //See All QA e tıkla.


        JavascriptExecutor filter = (JavascriptExecutor) driver;
        filter.executeScript("window.scrollBy(0, 300);");
        Thread.sleep(17000);


        driver.findElement(By.xpath("//span[contains(@class, 'select2-selection__rendered')]")).click();
    Thread.sleep(5000);  // All butonuna tıkla location.


        driver.findElement(By.cssSelector(".select2-results__option--highlighted")).click();
Thread.sleep(5000);  //İstanbul Turkey tıkla.  (Olumsuz)

        driver.findElement(By.id("select2-filter-by-department-container")).click(); //ALL butonuna tıkla department.
Thread.sleep(5000);

        driver.findElement(By.cssSelector(".select2-results__option--highlighted")).click();
        Thread.sleep(2000);  //Quality Assurance tıkla. (olumsuz)


        JavascriptExecutor viewRole = (JavascriptExecutor) driver;
        viewRole.executeScript("window.scrollBy(0, 530);");
        Thread.sleep(15000);

        driver.findElement(By.xpath("//a[@href='https://jobs.lever.co/useinsider/f06a3f84-3a0c-4190-8b78-517b9adc981c']")).click();
Thread.sleep(10000);  // View role tıkla.



    }
    @AfterEach
    void tearDown(){
        driver.close();
    }
}


