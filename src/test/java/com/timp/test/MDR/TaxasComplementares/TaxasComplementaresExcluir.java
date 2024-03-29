package com.timp.test.MDR.TaxasComplementares;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeConversao.TaxasDeConversaoExcluirPO;

public class TaxasComplementaresExcluir extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TaxasDeConversaoExcluirPO taxasDeConversaoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		taxasDeConversaoExcluirPO = new TaxasDeConversaoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = taxasDeConversaoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}
}
