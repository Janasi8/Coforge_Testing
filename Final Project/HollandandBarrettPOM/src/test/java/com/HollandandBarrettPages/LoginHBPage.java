package com.HollandandBarrettPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHBPage {

    WebDriver driver;

    public LoginHBPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "username")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(name = "action")
    WebElement loginButton;

    public void loginHB(String uname, String pass) {

        email.sendKeys(uname);
        password.sendKeys(pass);
        loginButton.click();
    }
}