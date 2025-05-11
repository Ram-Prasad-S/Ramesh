package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefinition {
	
	WebDriver driver;

	@Given("User Launches Chrome Browser")
	public void user_launches_chrome_browser() {
		
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("User Enters URL {string}")
	public void user_enters_url(String GivenURL)
	{
		driver.get(GivenURL);
		driver.manage().window().maximize();	
		

	}

	@Then("User Enters Username as {string}")
	public void user_enters_username_as(String USERNAME) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		Thread.sleep(2000);

	}

	@Then("User Enters Password as {string}")
	public void user_enters_password_as(String PASSWORD) throws InterruptedException {
		
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		Thread.sleep(2000);

	}

	@Then("Clicks on Login Button")
	public void clicks_on_login_button() {
		
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	
	@Then("Sys through Invalid Credentials")
	public void sys_through_invalid_credentials() {
	    System.out.println("Invalid Login Credentials");
	}

}
