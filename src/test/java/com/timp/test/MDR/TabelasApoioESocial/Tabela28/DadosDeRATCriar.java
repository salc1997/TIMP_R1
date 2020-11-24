package com.timp.test.MDR.TabelasApoioESocial.Tabela28;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela28.DadosDeRATCriarPO;

public class DadosDeRATCriar extends TestBaseCristhian {
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DadosDeRATCriarPO dadosDeRATCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		dadosDeRATCriarPO = new DadosDeRATCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

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

		boolean sucesso = dadosDeRATCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
