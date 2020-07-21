package com.timp.test.MDR.Bairro;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoCriarPO;
import com.sap.timp.pageObjectModel.MDR.Bairro.BairroCriarPO;

public class BairroCriar extends TestBase{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	BairroCriarPO bairroCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		bairroCriarPO = new BairroCriarPO();
	}
	/*
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	*/
	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = bairroCriarPO.criarBairro();
		
		assertTrue(sucesso, Criar);
		
	}
}
