package com.timp.test.TAA.Agendamento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoCancelarPO;

public class AgendamentoCancelar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AgendamentoCancelarPO agendamentoCancelarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		agendamentoCancelarPO = new AgendamentoCancelarPO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}

	@Test()
	public void cancelar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = agendamentoCancelarPO.cancelar();
		assertTrue(sucesso, Criar);
	}
}
