package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithHeader {

	WebDriver driver;
	@Given("^User enter the OrangeHRM Login page URL$")
	public void user_enter_the_OrangeHRM_Login_page_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagadeesh\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^member enter creds username and password$")
	public void member_enter_creds_username_and_password(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String, String>>creds=dataTable.asMaps(String.class, String.class);
		String Username=creds.get(0).get("Username");
		String password=creds.get(0).get("Password");
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^click the enter to login$")
	public void click_the_enter_to_login() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^navigate to OrangeHRM Adminpage$")
	public void navigate_to_OrangeHRM_Adminpage() throws Throwable {
	   driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}

	@Then("^close the browser once Admin page is displayed$")
	public void close_the_browser_once_Admin_page_is_displayed() throws Throwable {
	   boolean Status=driver.findElement(By.id("systemUser-information")).isDisplayed();
	   Assert.assertTrue(Status);
	   driver.close();
	}
}
