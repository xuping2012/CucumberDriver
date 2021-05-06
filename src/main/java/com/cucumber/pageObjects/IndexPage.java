package com.cucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	WebDriver driver;

	public IndexPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void testPage(){
		System.out.println("测试一下2");
	}
}
