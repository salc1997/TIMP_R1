package com.timp.test.TCC.BancoDeCreditoExtemporaneo.PainelBCE.Executados;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.Executados.PainelBCEExecutadosEditarPO;

public class PainelBCEExecutadosEditar extends TestBaseEliel{
	
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	PainelBCEExecutadosEditarPO painelBCEExecutadosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		painelBCEExecutadosEditarPO = new PainelBCEExecutadosEditarPO();
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
		boolean sucesso = painelBCEExecutadosEditarPO.criar();
		assertTrue(sucesso, Editar);
	}
 
}