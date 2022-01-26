package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeader {
	WebDriver driver;
	@Given("^User entering the OrangeHRM Login page$")
	public void user_entering_the_OrangeHRM_Login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagadeesh\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^member enter username and password$")
	public void member_enter_username_and_password(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<String> Credentials=dataTable.asList(String.class);
		String Username=Credentials.get(0);
		String password=Credentials.get(1);

		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);	
		}

	@When("^click the enter$")
	public void click_the_enter() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^OrangeHRM Homepage should be displayed$")
	public void orangehrm_Homepage_should_be_displayed() throws Throwable {
		boolean Status= driver.findElement(By.id("welcome")).isDisplayed();
		Assert.assertTrue(Status);
		
		driver.close();
	}
}
