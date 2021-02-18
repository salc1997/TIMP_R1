package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM800;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM800.RegistroM800CriarPO;

public class RegistroM800Criar extends TestBaseEliel {
  
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	RegistroM800CriarPO registroM800CriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM800CriarPO = new RegistroM800CriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarTCC() {

		acessarTCCPO.acessarTCC();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = registroM800CriarPO.criar();

		assertTrue(sucesso, Criar);
	}
 
	
}
