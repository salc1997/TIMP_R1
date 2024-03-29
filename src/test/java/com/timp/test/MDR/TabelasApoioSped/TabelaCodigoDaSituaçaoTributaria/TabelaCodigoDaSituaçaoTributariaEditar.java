package com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSituašaoTributaria;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSituašaoTributaria.TabelaCodigoDaSituašaoTributariaEditarPO;

public class TabelaCodigoDaSituašaoTributariaEditar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaCodigoDaSituašaoTributariaEditarPO tabelaCodigoDaSituašaoTributariaEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaCodigoDaSituašaoTributariaEditarPO = new TabelaCodigoDaSituašaoTributariaEditarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tabelaCodigoDaSituašaoTributariaEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
