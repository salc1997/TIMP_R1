package com.timp.test.CALENDAR.Tarefas;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.Tarefas.TarefaManualPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TarefaManual extends TestBase{
	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;
	TarefaManualPO tarefaManualPO;
	 
  @BeforeClass
  public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
		tarefaManualPO = new TarefaManualPO();
  }

 
  
  @AfterClass
  public void afterClass() {
	  driver.close();
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

		
		
		ArrayList<Boolean> sucesso = tarefaManualPO.Manual();

		  for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		  }

	
	}


}
