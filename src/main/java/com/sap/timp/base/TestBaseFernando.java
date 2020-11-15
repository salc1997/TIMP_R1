package com.sap.timp.base;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseFernando extends TestBaseSteven {

	TestBaseSteven testeBaseSteven = new TestBaseSteven();

	public WebDriver initializationF() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver86.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(tc2);
		return driver;
	}

	public String capitalize(String cadena) {
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
}

