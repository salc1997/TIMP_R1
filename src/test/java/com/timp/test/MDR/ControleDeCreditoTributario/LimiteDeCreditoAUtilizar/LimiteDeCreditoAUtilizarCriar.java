package com.timp.test.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar.LimiteDeCreditoAUtilizarCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriarPO;

public class LimiteDeCreditoAUtilizarCriar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LimiteDeCreditoAUtilizarCriarPO limiteDeCreditoAUtilizarCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		limiteDeCreditoAUtilizarCriarPO = new LimiteDeCreditoAUtilizarCriarPO();
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

		boolean sucesso = limiteDeCreditoAUtilizarCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
