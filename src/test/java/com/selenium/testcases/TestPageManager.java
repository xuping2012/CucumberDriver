package com.selenium.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cucumber.PageObjectManager.PageObjectManager;
import com.cucumber.pageObjects.LoginPage;
import com.cucumber.pageObjects.SearchPage;


/**
 * 
 * TODO:测试页面对象管理器的作用
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file TestPageManager.java
 */
public class TestPageManager {

	private WebDriver driver;
	private LoginPage loginPage;
	private SearchPage searchPage;
	private PageObjectManager pageObjectManager;

	@BeforeClass
	void setUpClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pageObjectManager = new PageObjectManager(driver);
		loginPage = pageObjectManager.getLoginPage();
	}

	@Test
	void testLoginPage() {
		loginPage = pageObjectManager.getLoginPage();
		loginPage.testPage();
	}

	@Test
	void testSearchPage() {
		searchPage = pageObjectManager.getSearchPage();
		searchPage.openBrowser();
		searchPage.inputTxtAndClickBtn("cucumber");
	}

	@AfterClass
	void tearDownClass() {
		driver.quit();
	}
}
