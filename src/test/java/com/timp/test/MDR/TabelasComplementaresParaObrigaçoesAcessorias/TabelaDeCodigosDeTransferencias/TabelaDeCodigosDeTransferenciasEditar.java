package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasEditarPO;

public class TabelaDeCodigosDeTransferenciasEditar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeCodigosDeTransferenciasEditarPO tabelaDeCodigosDeTransferenciasEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeCodigosDeTransferenciasEditarPO = new TabelaDeCodigosDeTransferenciasEditarPO();
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

		boolean sucesso = tabelaDeCodigosDeTransferenciasEditarPO.editar();

		assertTrue(sucesso, Editar);

	}
}
