package com.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_Login_NopCommerce 
{
	
	WebDriver driver;
	public PF_Login_NopCommerce(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,PF_Login_NopCommerce.class);
	}
	
	 
	@FindBy(id="Email")
	WebElement txt_UserName;
	
	@FindBy(id="Password")
	WebElement txt_Password;
	
	@FindBy(xpath ="//button[contains(text(),'Log in')]")
	WebElement Login_Button;
	
	
	 public void enterUserName(String username ) 
	 {
		 txt_UserName.clear();
		 txt_UserName.sendKeys(username);
	 }
	 
	 public void enterPassword(String PASSWORD) 
	 {
		 txt_Password.clear();
		 txt_Password.sendKeys(PASSWORD);
	 }
	 
	 
	 public void clickLoginButton() 
	 {
		 
		 Login_Button.click();
	 }

}
