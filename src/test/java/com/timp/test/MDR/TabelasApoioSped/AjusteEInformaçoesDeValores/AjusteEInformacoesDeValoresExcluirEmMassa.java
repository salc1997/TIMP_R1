package com.timp.test.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores.AjusteEInformacoesDeValoresExcluirEmMassaPO;

public class AjusteEInformacoesDeValoresExcluirEmMassa extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AjusteEInformacoesDeValoresExcluirEmMassaPO ajusteEInformacoesDeValoresExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ajusteEInformacoesDeValoresExcluirEmMassaPO = new AjusteEInformacoesDeValoresExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
	   driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = ajusteEInformacoesDeValoresExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);

		sleep(1000);

	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = ajusteEInformacoesDeValoresExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
