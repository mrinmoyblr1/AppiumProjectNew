package appiumBase;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
public class Gestures extends Base {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		// driver.findElement(MobileBy.AndroidUIAutomator("text(\"Expandable
		// Lists\")")).click();
		// driver.findElement(MobileBy.AndroidUIAutomator("text(\"1. Custom
		// Adapter\")")).click();
		// Tap
		TouchAction t = new TouchAction(driver);
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"1. Custom Adapter\")")).click();
		WebElement pn = driver.findElement(MobileBy.AndroidUIAutomator("text(\"People Names\")"));
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		String str = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Sample menu\")")).getText();
		System.out.println(str);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
		
	}
}
