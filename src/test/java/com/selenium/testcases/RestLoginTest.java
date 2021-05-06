package com.selenium.testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cucumber.constants.Constants;

/**
 * 
 * TODO:TestNG测试框架应用，还是未使用任何模式
 * 
 * 因为po、关键字、数据驱动等等模式，应用太广，本工程主要演示cucumber
 * 这里不进一步演示如何封装及分成；提示：抽取公共代码封装公共方法调用，提高代码复用率
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file RestLoginTest.java
 */
public class RestLoginTest {

	private WebDriver driver;

	@BeforeClass
	void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.baseUrl);
	}

	@Test
	void testLoginEmail() {
		driver.switchTo().frame("login_frame");
		driver.findElement(By.id("u")).sendKeys(Constants.account);
		driver.findElement(By.id("p")).sendKeys(Constants.password);
		driver.findElement(By.id("login_button")).click();
		String txt = driver.findElement(By.id("useraddr")).getText();
		Assert.assertTrue(txt.equals(Constants.account));
	}

	@AfterClass
	void closeBrowser() {
		driver.quit();
	}
}
