package stepDefinationforlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Kodegearstepdefforlogin {
	WebDriver driver;
//set priorities for tests 
	@Test(priority =1)
	@Given("^Open krossover in chrome$")
	public void Open_krossover_in_chrome() throws Throwable {
		String exePath = "Chromedriver_path/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("https://v2-pre-prod-app.krossover.com/intelligence/login");
		Thread.sleep(6000);
	}
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("valid email id");
		driver.findElement(By.name("password")).sendKeys("password");
	}

	@Then("^User should be able to Login successfully$")
	public void User_should_be_able_to_Login_successfully() throws Throwable {
		driver.findElement(By.id("sign-in-cta")).click();
		System.out.println("Login Succesfully");
	}
	@Test(priority =2)
	@Given("^Open krossover in google chrome$")
	public void Open_krossover_in_google_chrome() throws Throwable {
		String exePath = "D:/mobile_testing/eclipse/chromedriver_win32/chromeproperty/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("https://v2-pre-prod-app.krossover.com/intelligence/login");
		Thread.sleep(6000);
	}

	@When("^I enter invalid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	public void I_enter_invalid_username_and_invalid_password(String username,String password) throws Throwable {
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("sign-in-cta")).click();
	}

	@Then("^Then Validate \"([^\"]*)\" and \"([^\"]*)\" AND should throw error message$")
	public void Then_Validate_username_and_password_AND_should_throw_error_message(String username,String password) throws Throwable {
	if(username == null || password == null)
	{
		int count = driver.findElements(By.xpath("//data-error[text()='Required!']")).size();
		if(count>0)
		{
			System.out.println("Test Case Pass");
		}
		
	}
	}
	@Test(priority =3)
	@Given("^Open krossover site in chrome$")
	public void Open_krossover_site_in_chrome() throws Throwable {
		WebDriver driver = new ChromeDriver();
		String exePath = "D:/mobile_testing/eclipse/chromedriver_win32/chromeproperty/chromedriver.exe";
		driver.get("https://v2-pre-prod-app.krossover.com/intelligence/login");
		Thread.sleep(6000);
	}
	@When("^I enter valid username and click on forgot your password link$")
	public void I_enter_valid_username_AND_click_on_forgot_your_password_link() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("valid email id");
		driver.findElement(By.id("forgot-password-cta")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Then("^User should be able to submit mail id and should get mail$")
	public void User_should_be_able_to_submit_mail_id_and_should_get_mail() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("valid email id");
		driver.findElement(By.className("button-forgot")).submit();
		int counts = driver.findElements(By.xpath("//span data-ng-bind-html[text()='Error requesting password reset for valid email id']")).size();
		if(counts>1)
		{
			System.out.println("Test Case fail");
		}
	}
}
