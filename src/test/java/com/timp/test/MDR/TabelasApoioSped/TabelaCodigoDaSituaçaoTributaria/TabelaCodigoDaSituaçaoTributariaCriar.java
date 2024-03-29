package com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaCriarPO;

public class TabelaCodigoDaSituaçaoTributariaCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaCodigoDaSituaçaoTributariaCriarPO tabelaCodigoDaSituaçaoTributariaCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaCodigoDaSituaçaoTributariaCriarPO = new TabelaCodigoDaSituaçaoTributariaCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		// ajusteEInformaçoesDeValoresCriarPO.criar();

		boolean sucesso = tabelaCodigoDaSituaçaoTributariaCriarPO.criar();
		;
		assertTrue(sucesso, semAcesso);

	}

}
