package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Constants;

public class SeleniumLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:/javaWorkspace/cucumber/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.baseUrl);

		driver.switchTo().frame("login_frame");
		driver.findElement(By.xpath("//*[@id='switcher_plogin']")).click();
		WebElement emailField = driver.findElement(By.id("u"));
		emailField.sendKeys(Constants.account);

		WebElement passwordField = driver.findElement(By.id("p"));
		passwordField.sendKeys(Constants.password);

		WebElement goButton = driver.findElement(By.id("login_button"));
		goButton.click();

		Thread.sleep(3000);
		WebElement welcomeText = driver.findElement(By
				.xpath("//b[text()='№叁氛锺熱度']"));
		System.out.println("登录成功");

		driver.quit();
	}

}