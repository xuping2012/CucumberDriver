package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Constants;

public class TestingSteps {
	WebDriver driver;

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver",
				"D:/javaWorkspace/cucumber/driver/chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.baseUrl);
	}

//	@When("^Click userLoginLink$")
//	public void clickLoginLink(){
//		
//	}
	
	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() {
		
		driver.switchTo().frame("login_frame");
		
		driver.findElement(By.xpath("//*[@id='switcher_plogin']")).click();
		
		WebElement emailField = driver.findElement(By.id("u"));
		emailField.sendKeys(Constants.account);

		WebElement passwordField = driver.findElement(By.id("p"));
		passwordField.sendKeys(Constants.password);
	}

	@When("^Click Login button$")
	public void click_Login_button() throws InterruptedException {
		WebElement goButton = driver.findElement(By.id("login_button"));
		goButton.click();
		Thread.sleep(3000);
	}

	@Then("^He can visit mail home page$")
	public void he_can_visit_mail_home_page() {
		WebElement welcomeText = driver.findElement(By
				.xpath("//b[text()='№叁氛锺熱度']"));
	}

	@Then("^Account name is displayed$")
	public void account_name_is_displayed() {
		System.out.println("登录成功!");
	}
	
	@Then("^Click loginout link$")
	public void click_loginout(){
		driver.findElement(By.xpath("//a[text()='退出']")).click();
	}
	
	@Then("^Account loginout appliction$")
	public void account_loginout_success(){
		driver.findElement(By.xpath("//div[text()='您已成功退出QQ邮箱。']"));
	}
	
	@Then("^Close curret borwer$")
	public void close_borwer(){
		System.out.println("退出登录！");
		driver.close();
	}
}
