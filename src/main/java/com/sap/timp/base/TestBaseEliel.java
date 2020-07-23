package com.sap.timp.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseEliel extends TestBaseSteven {

	TestBaseSteven testeBaseSteven = new TestBaseSteven();

	public static WebDriver initializationE() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(td1);
		return driver;

	}
	
	

}
