package com.sap.timp.base;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Hashtable;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseKenssy extends TestBaseSteven{
	
	TestBaseSteven testeBaseSteven = new TestBaseSteven();

	public WebDriver initializationKen() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(tq1);
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
	
	public Month mesActual() {
		// Obtienes el mes actual
		Month mes = LocalDate.now().getMonth();

		// Obtienes el nombre del mes
		//String nombreMes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		//nombreMes = capitalize(nombreMes);
		
		//String nombreMes = mes;
		
		return mes;
	}
	
	public String anioActual() {
		// Obtienes el mes actual
		int anio = LocalDate.now().getYear();
		
		String anioString = String.valueOf(anio);
		return anioString;
	}
	
	public String getCodeMonthByMonth(String mes){
	    Hashtable<String, String> meses = new Hashtable<String, String>();
        meses.put("Janeiro","01");
        meses.put("Fevereiro","02");
        meses.put("Março","03");
        meses.put("Abril","04");
        meses.put("Maio","05");
        meses.put("Junho","06");
        meses.put("Julho","07");
        meses.put("Agosto","08");
        meses.put("Setembro","09");
        meses.put("Outubro","10");
        meses.put("Novembro","11");
        meses.put("Dezembro","12");
        return meses.get(mes);
	}

}
