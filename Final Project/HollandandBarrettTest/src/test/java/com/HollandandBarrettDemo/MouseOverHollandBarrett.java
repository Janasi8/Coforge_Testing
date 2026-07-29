package com.HollandandBarrettDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class MouseOverHollandBarrett {
    @Test
    public void mouseOver() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hollandandbarrett.com/");
        Thread.sleep(5000);
        // Accept Cookies
        WebElement acceptCookies = driver.findElement(
                By.xpath("//button[contains(.,'Accept All Cookies') or contains(.,'Accept')]"));
        acceptCookies.click();
        Thread.sleep(3000);
        // Hover over Vitamins & Supplements
        WebElement vitamins = driver.findElement(
                By.xpath("//a[contains(text(),'Vitamins & Supplements')]"));
        Actions act = new Actions(driver);
        act.moveToElement(vitamins).perform();
        Thread.sleep(3000);
        // Click Vitamins & Supplements
        vitamins.click();
        Thread.sleep(5000);
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}