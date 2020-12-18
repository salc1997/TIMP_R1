package com.sap.timp.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;


public class TestBaseMassiel extends TestBaseSteven {

	TestBaseSteven testeBaseSteven = new TestBaseSteven();

	public WebDriver initializationM() {


		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
        
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(tc2);

	   return driver;
	}
	
	//PARA PODER EJECUTAR TA-518
	public String dataanterior() {
		
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add (Calendar.DAY_OF_MONTH, -1);
		
		return df.format(cal.getTime());
		
	}
	
	public String diaHoy() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();
		
		String dia = Integer.toString(c2.get(Calendar.DATE));
		

		return dia;

	}
	
	public void closeSelectTypeCheckbox(WebElement element) {
		new Actions(driver).moveToElement(element).click().perform();
	}
	
	public String anioActual() {
		// Obtienes el mes actual
		int anio = LocalDate.now().getYear();
		
		String anioString = String.valueOf(anio);
		return anioString;
	}
	
	


}