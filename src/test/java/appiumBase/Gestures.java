package appiumBase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends Base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Expandable Lists\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"1. Custom Adapter\")")).click();
		
		//Tap
		TouchAction t=new TouchAction(driver);
		t.tap(tapOptions().withElement(element(webElement)))
		
		
		
		
		

	}

}
