package stepDefinationforsearch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KodegearstepdefforSearch {
	WebDriver driver;

@Given("^Open krossover supoort in chrome$")
public void Open_krossover_supoort_in_chrome() throws Throwable {
	String exePath = "chromedriverpath/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	driver = new ChromeDriver();
	driver.get("http://support.krossover.com/");
	Thread.sleep(6000);
}
	

@When("^I enter \"([^\"]*)\"$")
public void I_enter(String search_term) throws Throwable {
	driver.findElement(By.id("q")).sendKeys(search_term);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}
	@Then("^Verify search ablity \"([^\"]*)\"$")
	public void Verify_search_ablity(String search_term)
	{
		String str = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[1]/h2")).getText();
		if(str.contains(search_term)&& str.contains("results"))
		{
			System.out.println("Test Case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
	}
}