package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos.TabelaDeProdutosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.remote.NewSessionPayload;
import org.testng.annotations.AfterClass;

public class TabelaDeProdutosEditar extends TestBase{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeProdutosEditarPO tabelaDeProdutosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeProdutosEditarPO = new TabelaDeProdutosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaDeProdutosEditarPO.Editar();
		assertTrue(sucesso, semAcesso);

	}

}
