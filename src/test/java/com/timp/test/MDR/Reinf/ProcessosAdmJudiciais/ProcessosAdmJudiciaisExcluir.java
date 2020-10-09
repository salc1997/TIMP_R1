package com.timp.test.MDR.Reinf.ProcessosAdmJudiciais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisExcluirPO;

public class ProcessosAdmJudiciaisExcluir extends TestBaseEliel {
 
	
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ProcessosAdmJudiciaisExcluirPO processosAdmJudiciaisExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		processosAdmJudiciaisExcluirPO = new ProcessosAdmJudiciaisExcluirPO();
	}
	
	@AfterClass public void afterClass(){ driver.close(); }
	

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

		
		boolean sucesso = processosAdmJudiciaisExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		
	}			

}
