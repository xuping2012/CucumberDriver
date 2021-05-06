package com.selenium.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cucumber.pageObjects.SearchPage;

/**
 * 
 * TODO:测试一下driver管理器是否生效
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file TestWebDriverManager.java
 */
public class TestContextAgain {

	WebDriver driver;
	SearchPage searchPage;

	@BeforeClass
	void setUpClass() {
		driver = new ChromeDriver();
		searchPage = new SearchPage(driver);
	}

	@Test
	void testDriver() {
		searchPage.openBrowser();
		searchPage.inputTxtAndClickBtn("Singleton");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	void tearDownClass() {
		driver.quit();
	}
}
