package com.cucumber.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.cucumber.pageObjects.IndexPage;
import com.cucumber.pageObjects.LoginPage;
import com.cucumber.pageObjects.SearchPage;

/**
 * 
 * TODO:页面对象管理器，负责事情是仅在对象不为null的时候创建，否则直接返回对象。
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file PageObjectManager.java
 */
public class PageObjectManager {

	private WebDriver driver;

	private SearchPage searchPage;
	private IndexPage indexPage;
	private LoginPage loginPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public SearchPage getSearchPage() {
		return (searchPage == null) ? searchPage = new SearchPage(driver)
				: searchPage;
	}

	public IndexPage getIndexPage() {
		return (indexPage == null) ? indexPage = new IndexPage(driver)
				: indexPage;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver)
				: loginPage;
	}

}
