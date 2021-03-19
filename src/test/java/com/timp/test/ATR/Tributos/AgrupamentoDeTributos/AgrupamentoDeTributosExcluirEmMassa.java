package com.timp.test.ATR.Tributos.AgrupamentoDeTributos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosExcluirEmMassaPO;

public class AgrupamentoDeTributosExcluirEmMassa extends TestBaseEliel{
  
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	AgrupamentoDeTributosExcluirEmMassaPO agrupamentoDeTributosExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		agrupamentoDeTributosExcluirEmMassaPO = new AgrupamentoDeTributosExcluirEmMassaPO();
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
	public void acessarATR() {

		acessarATRPO.acessarATR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = agrupamentoDeTributosExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = agrupamentoDeTributosExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
 
}
