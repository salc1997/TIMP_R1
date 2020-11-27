
package com.sap.timp.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseKathy extends TestBaseSteven {

	TestBaseSteven testeBaseSteven = new TestBaseSteven();

	public WebDriver initializationK() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(tc2);
		return driver;
		
		
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> branch 'master' of https://github.com/salc1997/TIMP_R1.git
