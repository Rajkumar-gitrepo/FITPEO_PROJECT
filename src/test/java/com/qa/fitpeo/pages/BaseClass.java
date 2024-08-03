package com.qa.fitpeo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	@BeforeTest
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://fitpeo.com/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
