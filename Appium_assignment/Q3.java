package Appium_assignment;




	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.AppiumDriver;

	// Write an Appium Program to connect with real device with ecommerce based application using Generalstore.app to perform swipe demo to swipe the menu.

	public class Q3 {
		static AppiumDriver driver = null;
		
		public static void main(String[] args) throws InterruptedException {
			try {
				generalStoreSwipeMenu();

			} catch (MalformedURLException e) {
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		public static void generalStoreSwipeMenu() throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "OnePlus 7");
			cap.setCapability("udid", "31fb1e1f");		
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "11");
			cap.setCapability("app", "C:\\Users\\HP\\OneDrive\\Desktop\\General-Store.apk");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AppiumDriver(url, cap);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"American Samoa\"]")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Dipam");
			driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

	}
	}


