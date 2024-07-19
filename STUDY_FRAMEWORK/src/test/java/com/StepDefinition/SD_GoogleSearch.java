package com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_GoogleSearch 
{
	WebDriver driver;
	
	@Given("User navigated to Google.com")
	public void user_navigated_to_google_com() 
	{

		driver = new ChromeDriver();
		driver.get("https://google.com/");
	}

	@When("User search text on searchbox")
	public void user_search_text_on_searchbox()
	{

		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Facebook");
	}

	@And("User click enter")
	public void user_click_enter() {
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	}

	@Then("Search Result Found")
	public void search_result_found()
	{
		
		 	String actualTitle = driver.getTitle();
	        String expectedTitle = "Dashboard / nopCommerce administration";
	        Assert.assertEquals(actualTitle, expectedTitle, "Home page title does not match!");
	}


}
