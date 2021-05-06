package com.selenium.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.constants.Constants;

/**
 * 
 * TODO: 没有使用测试框架、没有模式的线性脚本
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file SeleniumLoginTest.java
 */
public class SeleniumLoginTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.baseUrl);

		driver.switchTo().frame("login_frame");
		// System.out.println("切换了iframe，就不点登录tab");
		// driver.findElement(By.xpath("//*[@id='qqLoginTab']")).click();
		WebElement emailField = driver.findElement(By.id("u"));

		emailField.sendKeys(Constants.account);

		WebElement passwordField = driver.findElement(By.id("p"));

		passwordField.sendKeys(Constants.password);

		WebElement goButton = driver.findElement(By.id("login_button"));

		goButton.click();

		try {
			WebElement welcomeText = driver.findElement(By
					.xpath("//b[text()='№叁氛锺熱度']"));
			welcomeText.getText();
			System.out.println("登录成功");
			Thread.sleep(1500);
		} catch (Exception e) {
			System.out.println("登录失败");
			e.printStackTrace();
		} finally {
			driver.quit();
			System.out.println("关闭浏览器");
		}
	}
}