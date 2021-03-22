package com.timp.test.TDK.Kpis.KpisPublicos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisPublicos.KpisLixeiraEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisLixeiraEmMassa extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisLixeiraEmMassaPO kpisLixeiraEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisLixeiraEmMassaPO = new KpisLixeiraEmMassaPO();
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
	public void acessarTDK() {
		acessarTDKPO.acessarTDK();
	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = kpisLixeiraEmMassaPO.Criar();

		assertTrue(sucesso, Criar);

		boolean sucesso2 = kpisLixeiraEmMassaPO.ExcluirMasas();

		assertTrue(sucesso2, Criar);

		boolean sucesso3 = kpisLixeiraEmMassaPO.comparar();

		assertTrue(sucesso3, Criar);

	}

}
