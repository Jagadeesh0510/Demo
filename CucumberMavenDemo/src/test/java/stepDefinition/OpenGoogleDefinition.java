package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinition {

	 WebDriver driver;

	@Given("^user is entering Google\\.co\\.in$")
	public void user_is_entering_Google_co_in() throws Throwable {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");

	}

	@When("^user enter the search term \"([^\"]*)\"$")
	public void user_enter_the_search_term(String searchterm) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(searchterm);

	}

	@When("^click the enter key$")
	public void click_the_enter_key() throws Throwable {

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^the user should see the search results$")
	public void the_user_should_see_the_search_results() throws Throwable {

		boolean status =driver.findElement(By.partialLinkText("Jordan")).isDisplayed();
		if(status) {
			System.out.println("Jordan time zone is displayed");
			Thread.sleep(5000);
			driver.close();
		}
		
	}

}
