package com.cucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * 
 * TODO:测试封装一个首页，PageFactory设计模式
 *
 * @author Joe-Tester
 * @time 2021年5月7日
 * @file IndexPage.java
 */
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
