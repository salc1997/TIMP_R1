package com.timp.test.TAA.Agendamento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoCriarPO;

public class AgendamentoCriar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarTAAPO  acessarTAAPO;
	AgendamentoCriarPO agendamentoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		agendamentoCriarPO = new AgendamentoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarTAA() {
		acessarTAAPO.acessarTAA();
	}

	@Test(priority = 2)
	public void criar() {
		boolean sucesso = agendamentoCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}