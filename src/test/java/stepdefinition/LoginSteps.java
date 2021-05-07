package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.constants.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * 
 * TODO:feature功能场景用例步骤
 *
 * @author Joe-Tester
 * @time 2021年5月7日
 * @file LoginSteps.java
 */
public class LoginSteps {
	WebDriver driver;
	String text;

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() {
		driver = new ChromeDriver();
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.baseUrl);
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() {
		driver.switchTo().frame("login_frame");
		WebElement emailField = driver.findElement(By.id("u"));
		emailField.sendKeys(Constants.account);
		WebElement passwordField = driver.findElement(By.id("p"));
		passwordField.sendKeys(Constants.password);
	}

	@When("^Click Login button$")
	public void click_Login_button() {
		WebElement goButton = driver.findElement(By.id("login_button"));
		goButton.click();
	}

	@Then("^He can visit mail home page$")
	public void he_can_visit_mail_home_page() {
		text = driver.findElement(By.id("useraddr")).getText();
	}

	@Then("^Account name is displayed$")
	public void account_name_is_displayed() {
		if (text.equals(Constants.account)) {
			System.out.println("登录成功!");
		}
		System.out.println("登录失败");
	}

	@Then("^Click loginout link$")
	public void click_loginout() {
		driver.findElement(By.xpath("//a[text()='退出']")).click();
	}

	@Then("^Account loginout appliction$")
	public void account_loginout_success() {
		driver.findElement(By.xpath("//div[text()='您已成功退出QQ邮箱。']"));
	}

	@Then("^Close curret borwer$")
	public void close_borwer() {
		System.out.println("退出登录！");
		driver.close();
	}
}
