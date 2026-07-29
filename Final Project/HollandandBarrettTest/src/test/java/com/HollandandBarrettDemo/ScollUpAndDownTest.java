package com.HollandandBarrettDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ScollUpAndDownTest {
    WebDriver driver;
    String url = "https://www.hollandandbarrett.com/";
    @Test
    public void testScroll() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // Wait for page to load
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down
        js.executeScript("window.scrollBy(0,5000);");
        Thread.sleep(3000);

        // Scroll up
        js.executeScript("window.scrollBy(0,-5000);");
        Thread.sleep(3000);

        driver.quit();
    }
}