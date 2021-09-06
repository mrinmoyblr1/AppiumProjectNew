package appiumBase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_Test_3 extends HybridBase{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");		
		driver.hideKeyboard();
		
		//driver.findElementByXPath("//*[@text='Female]'").click();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Female\")")).click();		
		driver.findElementById("android:id/text1").click();
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"India\").instance(0))"));
		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"India\")")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();


		
	}

}
