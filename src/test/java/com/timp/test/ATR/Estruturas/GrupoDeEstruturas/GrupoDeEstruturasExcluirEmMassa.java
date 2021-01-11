package com.timp.test.ATR.Estruturas.GrupoDeEstruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

public class GrupoDeEstruturasExcluirEmMassa extends TestBaseEliel{
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	GrupoDeEstruturasExcluirEmMassaPO grupoDeEstruturasExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		grupoDeEstruturasExcluirEmMassaPO = new GrupoDeEstruturasExcluirEmMassaPO();
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
	public void acessarATR() {

		acessarATRPO.acessarATR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = grupoDeEstruturasExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = grupoDeEstruturasExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
 
}
