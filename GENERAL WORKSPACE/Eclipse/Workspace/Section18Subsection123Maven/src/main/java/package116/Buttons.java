package package116;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Buttons {
	
		public Buttons(AppiumDriver driver) {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		@AndroidFindBy(className="android.widget.Button")
		public List<WebElement> buttons;
		
		
}
