package com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaCriarPO;

public class TabelaCodigoDaSituaçaoTributariaCriar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaCodigoDaSituaçaoTributariaCriarPO tabelaCodigoDaSituaçaoTributariaCriarPO;

	@BeforeClass
	public void beforeClass() {
 
		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaCodigoDaSituaçaoTributariaCriarPO = new TabelaCodigoDaSituaçaoTributariaCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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

		// ajusteEInformaçoesDeValoresCriarPO.criar();

		boolean sucesso = tabelaCodigoDaSituaçaoTributariaCriarPO.criar();
		;
		assertTrue(sucesso, semAcesso);

	}

}
