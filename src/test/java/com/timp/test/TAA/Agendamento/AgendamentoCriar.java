package com.timp.test.TAA.Agendamento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoCriarPO;

public class AgendamentoCriar extends TestBase {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AgendamentoCriarPO agendamentoCriarPO;
 
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		agendamentoCriarPO = new AgendamentoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = agendamentoCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
