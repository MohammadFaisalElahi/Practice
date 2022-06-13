package com.bank.faisal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App {
	
	@Test
	public static void test() throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faisal\\Browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://google.com");

		Thread.sleep(3000);

		driver.quit();

	}
	
	@Test
	public static void testAirAsia() throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faisal\\Browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.airasia.co.in/home");

		Thread.sleep(3000);

		driver.quit();

	}
}
