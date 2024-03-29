package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasEditarPO;

public class TabelaDeCodigosDeTransferenciasEditar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeCodigosDeTransferenciasEditarPO tabelaDeCodigosDeTransferenciasEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeCodigosDeTransferenciasEditarPO = new TabelaDeCodigosDeTransferenciasEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaDeCodigosDeTransferenciasEditarPO.editar();
		assertTrue(sucesso, Editar);

	}
}
