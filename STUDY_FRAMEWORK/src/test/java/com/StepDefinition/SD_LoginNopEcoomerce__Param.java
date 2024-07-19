/*
package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_LoginNopEcoomerce__Param 
{
	
	WebDriver driver;
	
@Given("User navigated to URL")
public void user_navigated_to_url() {
	driver=new FirefoxDriver();
	driver.get("http://admin-demo.nopcommerce.com/login");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));  
}

@When("User Enters Valid {string} and {string}")
public void user_enters_username_and_password( String username,String password) throws InterruptedException 
{
    
	driver.findElement(By.xpath(" //input[@id='Email']   ")).clear();
	driver.findElement(By.xpath(" //input[@id='Email']   ")).sendKeys(username);
	driver.findElement(By.xpath(" //input[@id='Password']   ")).clear();
	driver.findElement(By.xpath("//input[@id='Password'] ")).sendKeys(password);
	Thread.sleep(400);
}

@And("User clicks on the login button")
public void user_clicks_on_the_login_button() {
    
	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
}

@Then("User navigates to the home page and verify")
public void user_navigates_to_the_home_page_and_verify() {

	String actualTitle=driver.getTitle();
	String expectedTitle="Dashboard / nopCommerce administration";

	if(actualTitle.equals(expectedTitle))
	{

		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	

	}
	driver.close();
}

}


*/