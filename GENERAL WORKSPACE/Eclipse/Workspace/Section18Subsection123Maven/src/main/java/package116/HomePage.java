package package116;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

// All the objects belonging to one page
// will be defined in java class
public class HomePage {
		
	// 1. Is to call the driver object from the test
	// case to PageObject file
	
	// Concatenate driver
	public HomePage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement preferences;
	
	//findElementByXPath("//android.widget.TextView[@text='Preference']"))
}
