package com.timp.test.MDR.Siscoserv.NBS;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.NBS.NBSCriarPO;

public class NBSCriar extends TestBase {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	NBSCriarPO nbsCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		nbsCriarPO = new NBSCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = nbsCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
	
}
