package com.sap.timp.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
<<<<<<< HEAD
//import com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFEditarPO;
=======
>>>>>>> branch 'master' of https://github.com/salc1997/TIMP_R1.git

public class TestBaseMassiel extends TestBaseSteven {

	TestBaseSteven testeBaseSteven = new TestBaseSteven();

	public WebDriver initializationM() {


		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/salc1997/TIMP_R1.git
		driver.get(tc2);

<<<<<<< HEAD
=======
		driver.get(tq1);

>>>>>>> branch 'master' of https://github.com/salc1997/TIMP_R1.git
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
	


}