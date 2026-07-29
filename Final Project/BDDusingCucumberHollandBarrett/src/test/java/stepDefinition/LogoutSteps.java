package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LogoutSteps {
    @When("User should click My Account")
    public void user_should_click_my_account() throws Exception {
        Thread.sleep(5000);
        CommonSteps.driver.findElement(
                By.xpath("//div[@aria-label='Janasi']"))
                .click();
        Thread.sleep(3000);
    }
    @When("User should click Logout")
    public void user_should_click_logout() throws Exception {
        Thread.sleep(3000);
        CommonSteps.driver.findElement(
                By.xpath("//button[@class='jsx-4006266799 secondary size-m with-icon']"))
                .click();
        Thread.sleep(5000);
    }
    @Then("User should logout successfully")
    public void user_should_logout_successfully() {
        String currentUrl = CommonSteps.driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        Assert.assertEquals("https://www.hollandandbarrett.com/", currentUrl);
        System.out.println("Logout Successful");
        CommonSteps.driver.quit();
    }
    }
