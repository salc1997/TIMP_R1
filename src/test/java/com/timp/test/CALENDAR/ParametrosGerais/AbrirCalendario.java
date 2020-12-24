package com.timp.test.CALENDAR.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.ParametrosGerais.AbrirCalendarioPO;
import com.sap.timp.pageObjectModel.Calendar.ParametrosGerais.CalendarioDeUsuariosPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

public class AbrirCalendario extends TestBaseSteven {

	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;
	AbrirCalendarioPO abrirCalendarioPO;

	public AbrirCalendario() {
		super();
	}

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
		abrirCalendarioPO = new AbrirCalendarioPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
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

		boolean sucesso = abrirCalendarioPO.abrirCalendario();
		
		assertTrue(sucesso, filtros);

	}

}
