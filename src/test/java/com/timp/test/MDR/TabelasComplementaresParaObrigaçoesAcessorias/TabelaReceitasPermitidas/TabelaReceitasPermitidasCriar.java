package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaCodigoReceitas.TabelaCodigoReceitasCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas.TabelaReceitasPermitidasCriarPO;

public class TabelaReceitasPermitidasCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaReceitasPermitidasCriarPO tabelaReceitasPermitidasCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaReceitasPermitidasCriarPO = new TabelaReceitasPermitidasCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaReceitasPermitidasCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
