package Section14Subsection117Maven.AppiumFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_tc_4 extends base {
	
	@Test
	public static void totalValidadion() throws IOException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver=Capabilities("General-Store");
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		driver.hideKeyboard();
		driver.findElement(By.xpath("*//[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(\"Argentina\"));");
		driver.findElement(By.xpath("//*text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		// 59.
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		// 61.
		// Wait 4 seconds in order the test will not confused the pages
		Thread.sleep(4000);
		
		int count=driver.findElements(By.id("com.android.sample.generalstore:id/productPrice")).size();
		double sum=0;
		for(int i=0;i<count;i++) {
			
			String amount1=driver.findElements(By.id("com.android.sample.generalstore:id/productPrice")).get(0).getText();
		    double amount=getAmount(amount1);
		    sum=sum+amount;
		}
		
		String total=driver.findElement(By.id("com.android.sample.generalstore:id/totalAmountLbl")).getText();
		total=total.substring(1);
		double totalValue=Double.parseDouble(total);
				
		Assert.assertEquals(sum, totalValue);
		System.out.println("Sum of the product:"+sum);
		System.out.println("Total value of the products:"+totalValue);
		
	}
	public static double getAmount(String value) {
		value=value.substring(1);
		double amountvalue=Double.parseDouble(value);
		return amountvalue;
	}
}









