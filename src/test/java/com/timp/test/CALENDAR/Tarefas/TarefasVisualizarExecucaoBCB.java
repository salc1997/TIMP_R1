package com.timp.test.CALENDAR.Tarefas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.Tarefas.TarefasVisualizarExecucaoBCBPO;

public class TarefasVisualizarExecucaoBCB extends TestBase {
  
	
	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;
	TarefasVisualizarExecucaoBCBPO tarefasVisualizarExecucaoBCBPO;

	

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
		tarefasVisualizarExecucaoBCBPO = new TarefasVisualizarExecucaoBCBPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();

	}
	
	@Test(priority = 2)
	public void acessarCalendar() {
		acessarCalendarPO.acessarCalendar();

	}

	@Test(priority = 3)
	public void CalendarEntrar() {

		boolean sucesso = tarefasVisualizarExecucaoBCBPO.abrirCalendario();
		
		assertTrue(sucesso, "N�o foi Visualizado com sucesso");

	}
}
