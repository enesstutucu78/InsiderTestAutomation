package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://useinsider.com/");

        WebElement companyMenu = driver.findElement(By.id("navbarDropdownMenuLink"));
        Actions actions = new Actions(driver);
        actions.moveToElement(companyMenu).perform();
        WebElement careersButton = driver.findElement(By.cssSelector(".dropdown-sub a[href*='careers']"));
        careersButton.click();
    }
}