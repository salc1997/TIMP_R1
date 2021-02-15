package com.timp.test.MDR.Siscoserv.PaisMoeda;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.PaisMoeda.PaisMoedaExcluirEmMassaPO;

public class PaisMoedaExcluirEmMassa extends TestBaseEliel{

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	PaisMoedaExcluirEmMassaPO paisMoedaExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		paisMoedaExcluirEmMassaPO = new PaisMoedaExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	/*
	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}
	*/
	@Test()
	public void criar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = paisMoedaExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = paisMoedaExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
}
