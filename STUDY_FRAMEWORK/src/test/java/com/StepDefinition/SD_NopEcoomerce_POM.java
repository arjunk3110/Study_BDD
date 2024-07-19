/*


import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.pages.POM_Login_NopCommerce;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_NopEcoomerce_POM 
{
	
	WebDriver driver;
	
	
	
@Given("User navigated to URL")
public void user_navigated_to_url() {
	driver=new FirefoxDriver();
	System.out.println("This is POM MODEL");
	driver.get("http://admin-demo.nopcommerce.com/login");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));  
}


@When("User Enters Valid {string} and {string}")
public void user_enters_username_and_password( String username,String password) throws InterruptedException 
{    
	
	POM_Login_NopCommerce login= new POM_Login_NopCommerce(driver);
	login.enterUserName(username);
	login.enterPassword(password);

	Thread.sleep(400);
}



@And("User clicks on the login button")
public void user_clicks_on_the_login_button() {
  
	POM_Login_NopCommerce login= new POM_Login_NopCommerce(driver);
	login.clickLoginButton();
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