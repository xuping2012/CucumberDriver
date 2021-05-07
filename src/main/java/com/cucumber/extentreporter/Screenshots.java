package com.cucumber.extentreporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

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

	public static byte[] takeScreenshot(WebDriver driver) {
		final byte[] screenshot = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.BYTES);

		return screenshot;
	}
}