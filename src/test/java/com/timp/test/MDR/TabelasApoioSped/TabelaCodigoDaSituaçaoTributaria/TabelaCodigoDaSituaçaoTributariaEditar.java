package com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaEditarPO;

public class TabelaCodigoDaSituaçaoTributariaEditar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaCodigoDaSituaçaoTributariaEditarPO tabelaCodigoDaSituaçaoTributariaEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaCodigoDaSituaçaoTributariaEditarPO = new TabelaCodigoDaSituaçaoTributariaEditarPO();
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
	public void editar() {

		String sucesso = tabelaCodigoDaSituaçaoTributariaEditarPO.editar();

		assertEquals(sucesso, "edit", visualizaçar);
	}

}
