package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoExcluirPO;

public class AtribuicaoMunicipioEstadoExcluir extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtribuicaoMunicipioEstadoExcluirPO atribuicaoMunicipioEstadoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atribuicaoMunicipioEstadoExcluirPO = new AtribuicaoMunicipioEstadoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = atribuicaoMunicipioEstadoExcluirPO.eliminar();
		assertTrue(sucesso, Eliminado);

	}

}
