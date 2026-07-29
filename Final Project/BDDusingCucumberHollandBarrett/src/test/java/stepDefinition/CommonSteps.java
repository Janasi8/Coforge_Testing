package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSteps {
    public static WebDriver driver;
    // Accept Cookies
    public void acceptCookies() {
        try {
            Thread.sleep(3000);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
            System.out.println("Cookies Accepted");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Cookie popup not displayed.");
        }
    }
    @Given("User should open Chrome Browser")
    public void user_should_open_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("User should launch Holland and Barrett Login page")
    public void user_should_launch_holland_and_barrett_login_page() {
        driver.get("https://auth.hollandandbarrett.com/u/login");
        acceptCookies();
    }
    @When("User should enter Email")
    public void user_should_enter_email() {
        driver.findElement(By.id("username"))
                .sendKeys("janasijaiswal@gmail.com");
    }
    @When("User should enter Password")
    public void user_should_enter_password() {
        driver.findElement(By.id("password"))
                .sendKeys("Janasi@123");
    }
    @When("User should click Login button")
    public void user_should_click_login_button() throws Exception {
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[3]/button"))
                .click();
        Thread.sleep(5000);
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        Assert.assertTrue(driver.getCurrentUrl().contains("hollandandbarrett"));
        System.out.println("Login Successful");
    }
    @When("User should open Holland and Barrett Home page")
    public void user_should_open_holland_and_barrett_home_page() {
        driver.get("https://www.hollandandbarrett.com/");
    }
    @When("User should accept Cookies")
    public void user_should_accept_cookies() {
        acceptCookies();

    }

}