package stepDefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMHomepage {

	WebDriver driver;
	
	@Given("^User entering the OrangeHRM Loginpage$")
	public void user_entering_the_OrangeHRM_Loginpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagadeesh\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^click enter$")
	public void click_enter() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	   
	}

	@Then("^OrangeHRM Homepage is displayed$")
	public void orangehrm_Homepage_is_displayed() throws Throwable {
	  
		boolean Status= driver.findElement(By.id("welcome")).isDisplayed();
		Assert.assertTrue(Status);
		
		driver.close();
		
	}
}
