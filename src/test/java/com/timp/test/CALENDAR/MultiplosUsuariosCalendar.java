package com.timp.test.CALENDAR;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.MultiplosUsuariosCalendarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class MultiplosUsuariosCalendar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;
	MultiplosUsuariosCalendarPO multiplosUsuariosCalendarPO;
 
  @BeforeClass
  public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
		multiplosUsuariosCalendarPO = new MultiplosUsuariosCalendarPO();
		
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
  }

  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}
	
	@Test(priority = 1)
	public void acessarCalendar() {
		acessarCalendarPO.acessarCalendar();

	}

	@Test(priority = 2)
	public void Calendar() {

		
		ArrayList<Boolean> sucesso = multiplosUsuariosCalendarPO.Calendario();

		  for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		  }

	}
}
