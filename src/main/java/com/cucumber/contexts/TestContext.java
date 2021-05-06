package com.cucumber.contexts;

import com.cucumber.PageObjectManager.PageObjectManager;
import com.cucumber.managers.WebDriverManager;


/**
 * 
 * TODO:测试上下文
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file TestContext.java
 */
public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	public ScenarioContext scenarioContext;

	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}

}