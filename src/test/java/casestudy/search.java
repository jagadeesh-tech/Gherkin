package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class search {
	WebDriver driver;
	@Given("^user must be in the login page$")
	public void user_must_be_in_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=utilityclass.startBrowser("chrome","http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();	
		
	}

	@When("^enter the search word \"([^\"]*)\"$")
	public void enter_the_search_word(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.name("products")).sendKeys(arg1);
	}

	@Then("^the product is found and purchased$")
	public void the_product_is_found_and_purchased() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		Assert.assertEquals(driver.getTitle(),"Search");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
        driver.findElement(By.partialLinkText("Cart")).click();
        driver.findElement(By.linkText("Checkout")).click();
        driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/label/i")).click();
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.name("username")).sendKeys("123459");
		driver.findElement(By.name("password")).sendKeys("Pass@459");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.name("transpwd")).click();
		driver.findElement(By.name("transpwd")).sendKeys("Trans@459");
		driver.findElement(By.xpath("//input[@value='PayNow']")).click();
		Assert.assertEquals(driver.getTitle(),"Order Details");
		driver.findElement(By.linkText("Home")).click();
		System.out.println("the product is found");
	}

	@Then("^the product is not found$")
	public void the_product_is_not_found() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.findElement(By.id("itemscount")).getText(),"0");
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		System.out.println("the product is not found");
		driver.findElement(By.linkText("Home")).click();
		
		
	}
}
