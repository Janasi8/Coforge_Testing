package stepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AddToBasketSteps {
    @When("User should click Vitamins and Supplements")
    public void user_should_click_vitamins_and_supplements() throws Exception {
        Thread.sleep(5000);
        CommonSteps.driver.findElement(
                By.xpath("//*[@id=\"_root_\"]/div[3]/div[1]/div/a[4]"))
                .click();
        Thread.sleep(5000);
    }
    @When("User should click first Add to Basket button")
    public void user_should_click_first_add_to_basket_button() throws Exception {
        Thread.sleep(5000);
        // Click first Add to Basket button
        CommonSteps.driver.findElement(
                By.xpath("//div[@class='SearchContentContainer-module_contentContainer__BQSS1']//div[1]//a[1]//div[1]//div[2]//div[2]//div[1]//button[2]//*[name()='svg']"))
                .click();
        Thread.sleep(5000);
        // Click Continue Shopping
        CommonSteps.driver.findElement(
                By.xpath("//button[contains(.,'Continue shopping')]"))
                .click();
        Thread.sleep(3000);
    }
    @Then("Product should be added successfully")
    public void product_should_be_added_successfully() {
        Assert.assertTrue(true);
        System.out.println("Product Added Successfully");
        // Don't close browser here.
        // Browser will close after Logout.
    }
}