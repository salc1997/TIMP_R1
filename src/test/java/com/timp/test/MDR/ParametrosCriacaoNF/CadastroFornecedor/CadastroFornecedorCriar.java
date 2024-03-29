package com.timp.test.MDR.ParametrosCriacaoNF.CadastroFornecedor;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroFornecedor.CadastroFornecedorCriarPO;

public class CadastroFornecedorCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroFornecedorCriarPO cadastroFornecedorCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroFornecedorCriarPO = new CadastroFornecedorCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	/*
	 * @Test(priority = 0) public void login() { loginTC.login();
	 * 
	 * }
	 * 
	 * @Test(priority = 1) public void acessarMDR() {
	 * 
	 * acessarMDRPO.acessarMDR();
	 * 
	 * }
	 */

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = cadastroFornecedorCriarPO.criar();
		assertTrue(sucesso, Criar);

	}

}
