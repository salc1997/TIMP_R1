package com.sap.timp.base;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestBaseCristhian extends TestBaseSteven{

	TestBaseSteven testeBaseSteven = new TestBaseSteven();

	public WebDriver initializationC() {


		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");


		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(tq1);
		return driver;
	}
	
	
	public String capitalize(String 
			cadena) {
		String[] split = cadena.split("");
        for (int i = 0; i < split.length; i++) {
            if(i == 0 || split[i-1].equals(" ")) {
                split[i] = split[i].toUpperCase();
            }
        }
        
        return String.join("", split);
	}
	
	public String mesActual() {
		// Obtienes el mes actual
		Month mes = LocalDate.now().getMonth();

		// Obtienes el nombre del mes
		String nombreMes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		nombreMes = capitalize(nombreMes);
		
		return nombreMes;
	}
	
	public String anioActual() {
		// Obtienes el mes actual
		int anio = LocalDate.now().getYear();
		
		String anioString = String.valueOf(anio);
		return anioString;
	}
	
	public void closeSelectTypeCheckbox(WebElement element) {
		new Actions(driver).moveToElement(element).click().perform();
	}

}
