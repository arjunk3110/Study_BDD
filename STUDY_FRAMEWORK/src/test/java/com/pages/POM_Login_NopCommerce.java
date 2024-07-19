package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Login_NopCommerce
{
   protected  WebDriver driver;

  
    // Locators
    private By txt_UserName = By.id("Email");
    private By txt_Password = By.id("Password");
    private By Login_Button = By.xpath("//button[contains(text(),'Log in')]");

    
    public  POM_Login_NopCommerce(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    
    // Method to enter the username
    public void enterUserName(String username) {
        driver.findElement(txt_UserName).clear();
        driver.findElement(txt_UserName).sendKeys(username);
    }

    // Method to enter the password
    public void enterPassword(String password) {
        driver.findElement(txt_Password).clear();
        driver.findElement(txt_Password).sendKeys(password);
    }

    // Method to click the login button
    public void clickLoginButton() {
        driver.findElement(Login_Button).click();
    }
}
