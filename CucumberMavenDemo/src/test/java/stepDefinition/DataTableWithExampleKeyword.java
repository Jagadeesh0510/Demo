package stepDefinition;

import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithExampleKeyword {
	WebDriver driver;
	
	@Given("^User enter the Orange HRM Login page URL$")
	public void user_enter_the_Orange_HRM_Login_page_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagadeesh\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^member enter cred \"([^\"]*)\" and \"([^\"]*)\"$")
	public void member_enter_cred_and(String Username, String Password) throws Throwable {

		
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}

	@When("^clicks login$")
	public void clicks_login() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^navigate to OrangeHRM Adminuser page$")
	public void navigate_to_OrangeHRM_Adminuser_page() throws Throwable {
		   driver.findElement(By.id("menu_admin_viewAdminModule")).click();

	}

	@Then("^close the browser once Adminuser page is displayed$")
	public void close_the_browser_once_Adminuser_page_is_displayed() throws Throwable {
		 boolean Status=driver.findElement(By.id("systemUser-information")).isDisplayed();
		   Assert.assertTrue(Status);
		   Thread.sleep(5000);
		   driver.close();
	}

}
