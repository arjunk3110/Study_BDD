package com.StepDefinition;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.PageFactory.PF_Login_NopCommerce;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_NopEcoomerce_PF{

    WebDriver driver;
    PF_Login_NopCommerce login;

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set a more reasonable implicit wait
        login = new PF_Login_NopCommerce(driver);
    }

    @Given("User navigated to URL")
    public void user_navigated_to_url() {
        System.out.println("This is PAGE FACTORY MODEL");
        driver.get("http://admin-demo.nopcommerce.com/login");
    }

    @When("User Enters Valid {string} and {string}")
    public void user_enters_username_and_password(String username, String password) {
        login.enterUserName(username);
        login.enterPassword(password);
    }

    @And("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        login.clickLoginButton();
    }

    @Then("User navigates to the home page and verify")
    public void user_navigates_to_the_home_page_and_verify() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard / nopCommerce administration";

        Assert.assertEquals("Title mismatch - User not navigated to home page", expectedTitle, actualTitle);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
