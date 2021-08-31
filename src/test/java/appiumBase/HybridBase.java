package appiumBase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class HybridBase {
	public static  AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {

		File appDir = new File("src\\test\\java");
		File app = new File(appDir, "General-Store.apk");
		DesiredCapabilities cap = new DesiredCapabilities();

		if(device.equalsIgnoreCase("emulator"))
		{
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Mrinmoyemulator");
		}
		else if(device.equalsIgnoreCase("Android Device"))
		{			
		//This will help to run the execution in real devices
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");			
		}
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
		return driver;
	}
}
