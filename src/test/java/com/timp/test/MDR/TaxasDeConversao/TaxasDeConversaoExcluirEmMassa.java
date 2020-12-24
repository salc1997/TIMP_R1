package com.timp.test.MDR.TaxasDeConversao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeConversao.TaxasDeConversaoExcluirEmMassaPO;

public class TaxasDeConversaoExcluirEmMassa extends TestBaseEliel {

	

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TaxasDeConversaoExcluirEmMassaPO taxasDeConversaoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		taxasDeConversaoExcluirEmMassaPO = new TaxasDeConversaoExcluirEmMassaPO();
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
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = taxasDeConversaoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = taxasDeConversaoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
	
}
