

/*
  
  package com.StepDefinition;
 


 import org.junit.Assert;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSD_NopEcommerce
{
	WebDriver driver;
	
	@Given("User navigated to URL")
	public void user_navigated_to_url()
	{
		driver=new ChromeDriver();
		driver.get("http://admin-demo.nopcommerce.com/login");
	}

	@When("User enters valid credentials")
	public void user_enters_valid_credentials()
	{
		driver.findElement(By.xpath(" //input[@id='Email']   ")).clear();
		driver.findElement(By.xpath(" //input[@id='Email']   ")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath(" //input[@id='Password']   ")).clear();
		driver.findElement(By.xpath("//input[@id='Password'] ")).sendKeys("admin");
	
	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button()
	{
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}

	@Then("User navigates to the home page and verify")
	public void user_navigates_to_the_home_page_and_verify()
	{
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
	}



}
*/