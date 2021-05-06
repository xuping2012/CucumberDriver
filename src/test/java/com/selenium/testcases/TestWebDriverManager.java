package com.selenium.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cucumber.PageObjectManager.PageObjectManager;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.pageObjects.SearchPage;


/**
 * 
 * TODO:测试一下driver管理器是否生效
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file TestWebDriverManager.java
 */
public class TestWebDriverManager {

	WebDriver driver;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	SearchPage searchPage;

	@BeforeClass
	void setUpClass() {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		searchPage = pageObjectManager.getSearchPage();
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
		webDriverManager.closeDriver();
	}
}
