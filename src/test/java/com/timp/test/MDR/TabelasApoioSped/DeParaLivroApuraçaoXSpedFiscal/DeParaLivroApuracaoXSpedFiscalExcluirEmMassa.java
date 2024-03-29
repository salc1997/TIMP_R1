package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApurašaoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApurašaoXSpedFiscal.DeParaLivroApuracaoXSpedFiscalExcluirEmMassaPO;

public class DeParaLivroApuracaoXSpedFiscalExcluirEmMassa extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApuracaoXSpedFiscalExcluirEmMassaPO deParaLivroApuracaoXSpedFiscalExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApuracaoXSpedFiscalExcluirEmMassaPO = new DeParaLivroApuracaoXSpedFiscalExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = deParaLivroApuracaoXSpedFiscalExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = deParaLivroApuracaoXSpedFiscalExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
