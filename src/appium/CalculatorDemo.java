package appium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorDemo {

	private AppiumDriver driver;

	@BeforeClass
	public void setup() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		cap.setCapability("platformName", "Android"); // 指定测试平台
		cap.setCapability("deviceName", "127.0.0.1:62001"); // 指定测试机的ID,通过adb命令`adb devices`获取
		cap.setCapability("platformVersion", "4.4");
		// 将上面获取到的包名和Activity名设置为值
		cap.setCapability("appPackage", "com.tencent.mm");
		cap.setCapability("appActivity",
				"com.tencent.mm.ui.LaucherUI");
		// A new session could not be created的解决方法
		cap.setCapability("appWaitActivity","com.tencent.mm.ui.LaucherUI");
		// 每次启动时覆盖session，否则第二次后运行会报错不能新建session
		cap.setCapability("sessionOverride", true);
		cap.setCapability("unicodeKeyboard", "true");//支持中文输入
		cap.setCapability("resetKeyboard", "true");//支持中文输入
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}

	@Test
	public void plus() {

		// 获取1
//		driver.findElementById("com.tencent.mm:id/drq").click();

	}

	@AfterClass
	public void tearDown() throws Exception {

		
//		driver.quit();

	}

}