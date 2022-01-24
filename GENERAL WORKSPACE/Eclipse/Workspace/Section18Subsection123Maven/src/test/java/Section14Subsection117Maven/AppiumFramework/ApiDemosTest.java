package Section14Subsection117Maven.AppiumFramework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import package116.Buttons;
import package116.HomePage;
import package116.Preferences;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class ApiDemosTest extends base{
	
	@Test
	public void apiDemo() throws MalformedURLException, IOException{
        AndroidDriver<AndroidElement> driver = Capabilities("ApiDemo");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
             
        HomePage h=new HomePage(driver);
        h.preferences.click();
        //((AndroidElement)driver.findElementByXPath("//android.widget.TextView[@text='Preference']")).click();
        // You can call the methods or variables of the class object
        
        Preferences p=new Preferences(driver);
        p.dependencies.click();
        //driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys(new CharSequence[]{"hello"});
        
        Buttons bt=new Buttons(driver); 
        bt.buttons.get(1).click();
        //driver.findElementsByClassName("android.widget.Button").get(1).click();
    }
}
