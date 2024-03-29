package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApurašaoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApurašaoXSpedFiscal.DeParaLivroApurašaoXSpedFiscalCriarPO;

public class DeParaLivroApurašaoXSpedFiscalCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApurašaoXSpedFiscalCriarPO deParaLivroApurašaoXSpedFiscalCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApurašaoXSpedFiscalCriarPO = new DeParaLivroApurašaoXSpedFiscalCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = deParaLivroApurašaoXSpedFiscalCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
