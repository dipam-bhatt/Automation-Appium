package Appium_assessment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Calculator {
	
		static AppiumDriver driver = null;
		
		public static void main(String[] args) throws InterruptedException {
			try {
				opencalculator();
			} catch (MalformedURLException e) {
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	
		public static void opencalculator() throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "OnePlus 7");
			cap.setCapability("udid", "31fb1e1f");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "11");
			cap.setCapability("appPackage", "com.oneplus.calculator");
			cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		 	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
			driver = new AppiumDriver(url, cap);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			// Addition
			driver.findElement(By.id("com.oneplus.calculator:id/digit_5")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/on_add")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/digit_3")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/img_eq")).click();
			Thread.sleep(1000);
			String value = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
			System.out.println("Addition : ");
			System.out.println("My Output is : " +value);
			driver.findElement(By.id("com.oneplus.calculator:id/img_clr")).click();
			
			// Substraction
			driver.findElement(By.id("com.oneplus.calculator:id/digit_6")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/img_on_sub")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/digit_3")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/img_eq")).click();
			Thread.sleep(1000);
			String value2 = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
			System.out.println("Substraction : ");
			System.out.println("My Output is : " +value2);
			driver.findElement(By.id("com.oneplus.calculator:id/img_clr")).click();
			
			// Multiplication
			driver.findElement(By.id("com.oneplus.calculator:id/digit_10")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/img_on_mul")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/digit_6")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/img_eq")).click();
			Thread.sleep(1000);
			String value3 = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
			System.out.println("Multiplication : ");
			System.out.println("My Output is : " +value3);
			driver.findElement(By.id("com.oneplus.calculator:id/img_clr")).click();
			
			// Division
			driver.findElement(By.id("com.oneplus.calculator:id/digit_5")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/img_on_div")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.oneplus.calculator:id/img_eq")).click();
			Thread.sleep(1000);
			String value4 = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
			System.out.println("Division : ");
			System.out.println("My Output is : " +value4);
			driver.findElement(By.id("com.oneplus.calculator:id/img_clr")).click();
}
}

