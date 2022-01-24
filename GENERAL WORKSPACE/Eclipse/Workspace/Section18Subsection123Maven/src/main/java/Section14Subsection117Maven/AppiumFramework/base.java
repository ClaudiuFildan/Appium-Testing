package Section14Subsection117Maven.AppiumFramework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class base {
    

    public static AndroidDriver<AndroidElement> Capabilities(String appName) throws MalformedURLException, IOException{
    	
    	// 119.
    	
    	FileInputStream file=new FileInputStream(System.getProperty("user/dir")
    			+ "\\src\\main\\java\\Section14Subsection117Maven\\"
    			+ "AppiumFramework\\global.properties");
    	Properties prop=new Properties();
    	
    	prop.load(file);
    	String device=(String) prop.get("device");
    	
        
    	// 51.
    	
    	AndroidDriver<AndroidElement> driver;
    	File appDir=new File("src");   	
    	File app=new File(appDir,(String)prop.get(appName));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        return driver;
                
    }
}









