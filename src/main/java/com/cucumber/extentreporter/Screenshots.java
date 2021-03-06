package com.cucumber.extentreporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;


/**
 * 
 * TODO:封装了两个类型的截图方法，一个适用于Cucumber框架的报告截图类型
 *
 * @author Joe-Tester
 * @time 2021年5月7日
 * @file Screenshots.java
 */
public class Screenshots {

	public static String takeScreenshot(WebDriver driver, String fileName)
			throws IOException {
		// 加入时间格式，会生成不一样文件名的截图
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String mDateTime = formatter.format(new Date());
		fileName = fileName + "_" + mDateTime + ".png";

		String directory = System.getProperty("user.dir") + "\\cucumber-reports\\screenshots\\";
		// 如何路径不存在则创建
		File reportDir = new File(directory);
		if (!reportDir.exists() && !reportDir.isDirectory()) {
			reportDir.mkdir();
		}
		// 截图
		File sourcePath = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);

		Files.copy(sourcePath, new File(directory + fileName));
		String destination = directory + fileName;
		return destination;
	}

	/**
	 * 这个方法是给Cucumber框架默认生成index.html报告用的，不是extentreport的报告
	 * @param driver
	 * @return
	 */
	public static byte[] takeScreenshot(WebDriver driver) {
		final byte[] screenshot = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.BYTES);

		return screenshot;
	}
}