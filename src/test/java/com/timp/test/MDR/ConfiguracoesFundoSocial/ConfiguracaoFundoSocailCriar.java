package com.timp.test.MDR.ConfiguracoesFundoSocial;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Bairro.BairroCriarPO;
import com.sap.timp.pageObjectModel.MDR.CodigoReceita.CodigoReceitaCriarPO;
import com.sap.timp.pageObjectModel.MDR.ConfiguracoesFundoSocial.ConfiguracoesFundoSocialCriarPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaCriarPO;

public class ConfiguracaoFundoSocailCriar extends TestBaseSteven{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ConfiguracoesFundoSocialCriarPO configuracoesFundoSocialCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		configuracoesFundoSocialCriarPO = new ConfiguracoesFundoSocialCriarPO();
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

		boolean sucesso = configuracoesFundoSocialCriarPO.criar();
		
		assertTrue(sucesso, Criar);
		
	}
}
