package com.timp.test.MDR.CadastroCondišao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondišao.CadastroCondicaoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroCondicaoExcluir extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroCondicaoExcluirPO cadastroExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroExcluirPO = new CadastroCondicaoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Excluir() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = cadastroExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}

}
