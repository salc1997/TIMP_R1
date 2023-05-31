package com.timp.test.TAA.Agendamento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoExcluirPO;

public class AgendamentoExcluir extends TestBase{
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AgendamentoExcluirPO agendamentoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		agendamentoExcluirPO = new AgendamentoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = agendamentoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
