package com.cucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * 
 * TODO:注意PageFactory设计模式
 *
 * @author Joe-Tester
 * @time 2021年5月7日
 * @file LoginPage.java
 */
public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void testPage(){
		System.out.println("测试一下1");
	}
}
