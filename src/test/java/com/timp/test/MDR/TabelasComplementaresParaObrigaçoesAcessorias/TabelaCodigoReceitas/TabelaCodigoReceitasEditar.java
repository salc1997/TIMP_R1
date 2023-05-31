package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaCodigoReceitas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaCodigoReceitas.TabelaCodigoReceitasEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaCodigoReceitasEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaCodigoReceitasEditarPO tabelaCodigoReceitasEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaCodigoReceitasEditarPO = new TabelaCodigoReceitasEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaCodigoReceitasEditarPO.Editar();
		assertTrue(sucesso, semAcesso);

	}

}
