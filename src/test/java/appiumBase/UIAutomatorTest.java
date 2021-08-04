package appiumBase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends Base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("text(\"Animation\")")).click();		
		
		// Validate the clickable features of all the options		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().property(Value)")).click();
		System.out.println(driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().clickable(true)")).size());
		
	}

}
