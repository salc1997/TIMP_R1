package com.timp.test.MDR.CadastroCondišao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondišao.CadastroCondicaoCriarPO;

public class CadastroCondicaoCriar extends TestBase{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroCondicaoCriarPO cadastroCondicaoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroCondicaoCriarPO = new CadastroCondicaoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		
	}


	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean text = cadastroCondicaoCriarPO.criar();
		assertTrue(text, Criar);
		sleep(2000);

	}

}
