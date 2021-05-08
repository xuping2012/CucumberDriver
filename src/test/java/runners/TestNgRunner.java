package runners;

import java.io.File;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ResourceCDN;
import com.cucumber.listener.Reporter;
import com.cucumber.managers.FileReaderManager;

import cucumber.api.CucumberOptions;
// 继承testng抽象类
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * 
 * TODO:TestNG集成cucumber
 * 
 * 
 * 注解@CucumberOptions features指向自然语言脚本的包名，也可以是feature文件的绝对路径
 * glue指向脚本的执行文件包名，也可以是绝对路径 plugin插件html报告输出指定路径，pretty是美化控制台报告
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file TestRun.java
 */

@CucumberOptions(monochrome = true, tags = { "@chinese" }, features = "src/test/features", glue = { "stepdefinition" }, plugin = {
		"pretty",
		"json:cucumber-reports/Cucumber.json",
		"junit:cucumber-reports/Cucumber.xml",
		"html:cucumber-reports/Thtml",
		"com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/Thtml/testng_extent.html" })
public class TestNgRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	public static void setup() {

	}

	@AfterClass
	public static void writeExtentReport() throws MalformedURLException {
		// 静态加载css样式
		Reporter.getExtentHtmlReport().config()
				.setResourceCDN(ResourceCDN.EXTENTREPORTS);
		// 加载配置extentreport报告配置文件
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance()
				.getConfigReader().getReportConfigPath()));
		// 增加系统信息
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");

	}

}