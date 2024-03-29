package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApurašaoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApurašaoXSpedFiscal.DeParaLivroApurašaoXSpedFiscalEditarPO;

public class DeParaLivroApurašaoXSpedFiscalEditar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApurašaoXSpedFiscalEditarPO deParaLivroApurašaoXSpedFiscalEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApurašaoXSpedFiscalEditarPO = new DeParaLivroApurašaoXSpedFiscalEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = deParaLivroApurašaoXSpedFiscalEditarPO.editar();

		assertTrue(sucesso, Editar);
	}

}
