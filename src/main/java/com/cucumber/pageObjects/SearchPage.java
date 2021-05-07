package com.cucumber.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.dataProviders.ConfigFileReader;

/**
 * 
 * TODO:PO测试模式，演示@FindBy\@FindAll\@CacheLookup等注解的用法 注意PageFactory设计模式
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file SearchPage.java
 */
public class SearchPage {
	WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "kw")
	@CacheLookup
	private WebElement input;

	@FindBy(id = "su")
	@CacheLookup
	private WebElement searchBtn;

	@FindAll(@FindBy(id = "xxx"))
	@CacheLookup
	private List<WebElement> prd_List;

	public void inputTxtAndClickBtn(String txt) {
		input.sendKeys(txt);
		searchBtn.click();
	}

	private String HOST = configFileReader.getApplicationUrl();

	public void openBrowser() {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		// TODO Auto-generated method stub
		driver.get(HOST);
	}
}