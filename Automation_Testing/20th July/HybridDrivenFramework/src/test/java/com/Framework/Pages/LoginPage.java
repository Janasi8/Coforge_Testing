package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "log_email")
    WebElement Username;

    @FindBy(how = How.NAME, using = "log_password")
    WebElement Password;

    @FindBy(how = How.XPATH, using = "//*[@id=\"log_frm\"]/div[4]/input[1]")
    WebElement BtnLogin;

    public void LoginHRM(String Uname, String Psd) {
        Username.sendKeys(Uname);
        Password.sendKeys(Psd);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        BtnLogin.click();
    }
}