package com.HollandandBarrettLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.HollandandBarrettPages.LoginHBPage;
import Helpers.BrowserFactory;

public class ExecuteLoginPage {
    @Test
    public void loginTest() {
        WebDriver driver = BrowserFactory.BrowserOptions(
                "chrome",
                "https://auth.hollandandbarrett.com/u/login?state=hKFo2SBzLWtMTFYxeUJfR2pMb1BfWFVRMEZILU5Pa2IxMlNNeaFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIG8zZTl4aWVCa1RsUGZoT3ZZdjlHNmJZWHAwWXVVR1lho2NpZNkgSmwzRWF2a010RDNpcjhLOTNSTlM4TldBVVFKcks4bnI");

        LoginHBPage login =
                PageFactory.initElements(driver, LoginHBPage.class);

        login.loginHB(
                "janasijaiswal@gmail.com",
                "Janasi@123");
    }
}