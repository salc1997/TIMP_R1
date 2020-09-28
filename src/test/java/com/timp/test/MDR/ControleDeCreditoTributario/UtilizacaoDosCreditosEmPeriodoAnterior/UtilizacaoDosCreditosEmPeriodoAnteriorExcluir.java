package com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior.UtilizacaoDosCreditosEmPeriodoAnteriorExcluirPO;

public class UtilizacaoDosCreditosEmPeriodoAnteriorExcluir extends TestBaseEliel {
 
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	UtilizacaoDosCreditosEmPeriodoAnteriorExcluirPO utilizacaoDosCreditosEmPeriodoAnteriorExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		utilizacaoDosCreditosEmPeriodoAnteriorExcluirPO = new UtilizacaoDosCreditosEmPeriodoAnteriorExcluirPO();
	}
	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
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
	public void excluir() {

		
		boolean sucesso = utilizacaoDosCreditosEmPeriodoAnteriorExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		
	}			
	
	
}
