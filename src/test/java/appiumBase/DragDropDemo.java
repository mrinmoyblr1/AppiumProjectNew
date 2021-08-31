package appiumBase;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragDropDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Drag and Drop\")")).click();	
		
		TouchAction t=new TouchAction(driver);		
		
//		WebElement first=driver.findElementByXPath("//android.view.View[@index='1']");
//		WebElement last=driver.findElementByXPath("//android.view.View[@index='2']");
		
		WebElement first=driver.findElementsByClassName("android.view.View").get(0);
		WebElement last=driver.findElementsByClassName("android.view.View").get(1);
		
		//t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(last)).release().perform();
		t.longPress(element(first)).moveTo(element(last)).release().perform();


	}

}
