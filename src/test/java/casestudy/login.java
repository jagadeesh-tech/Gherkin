package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login{
	WebDriver driver;
	@Given("^the login page$")
	public void the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=utilityclass.startBrowser("chrome","http://10.232.237.143:443/TestMeApp/login.htm");
		}

	@When("^username \"([^\"]*)\"$")
	public void username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^password\"([^\"]*)\"$")
	public void password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@Then("^home page$")
	public void home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
		Assert.assertEquals(driver.getTitle(),"Home");
	}
}


