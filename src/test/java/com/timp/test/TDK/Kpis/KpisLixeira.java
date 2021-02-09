package com.timp.test.TDK.Kpis;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisLixeiraPO;

public class KpisLixeira extends TestBaseEliel{
 
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisLixeiraPO kpisLixeiraPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisLixeiraPO = new KpisLixeiraPO();
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
	public void acessarTDK() {
		acessarTDKPO.acessarTDK();
	}
	
	@Test(priority = 2)
	public void lixeira() {
		boolean sucesso = kpisLixeiraPO.lixeira();
		assertTrue(sucesso,Eliminado);
		
		
		
	}
	
}
