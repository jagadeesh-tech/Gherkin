package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class registration {
	WebDriver driver;
	Select sel;
	@Given("^user must be in the signup page$")
	public void user_must_be_in_the_signup_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=utilityclass.startBrowser("chrome","http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}

	@When("^User enters the username \"([^\"]*)\"$")
	public void user_enters_the_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^user enters the first name \"([^\"]*)\"$")
	public void user_enters_the_first_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^user enters the lastname \"([^\"]*)\"$")
	public void user_enters_the_lastname(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^user enters the password \"([^\"]*)\"$")
	public void user_enters_the_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^user enters the confirmPssword \"([^\"]*)\"$")
	public void user_enters_the_confirmPssword(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}

	@When("^user selects the gender \"([^\"]*)\"$")
	public void user_selects_the_gender(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//input[@type='radio' and @value='"+arg1+"']")).click();

	}

	@When("^user enters the emailAddress \"([^\"]*)\"$")
	public void user_enters_the_emailAddress(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^user enters the mobileno \"([^\"]*)\"$")
	public void user_enters_the_mobileno(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.name("mobileNumber")).sendKeys(arg1);

	}

	@When("^user enters the dob \"([^\"]*)\"$")
	public void user_enters_the_dob(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.name("dob")).sendKeys(arg1);

	}

	@When("^user enters the Address \"([^\"]*)\"$")
	public void user_enters_the_Address(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.name("address")).sendKeys(arg1);

	}

	@When("^user selects the securityQuestion \"([^\"]*)\"$")
	public void user_selects_the_securityQuestion(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sel=new Select(driver.findElement(By.name("securityQuestion")));
		sel.selectByVisibleText(arg1);
	}

	@When("^User enters the Answers \"([^\"]*)\"$")
	public void user_enters_the_Answers(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("answer")).sendKeys(arg1);
	}

	@Then("^user land on the login page$")
	public void user_land_on_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("Submit")).click();
		  Assert.assertEquals(driver.getTitle(),"Login");
	}


}
