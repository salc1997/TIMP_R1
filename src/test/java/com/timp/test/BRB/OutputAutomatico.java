package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.DuplicidadePO;
import com.sap.timp.pageObjectModel.BRB.OutputAutomaticoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class OutputAutomatico extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	OutputAutomaticoPO outputAutomáticoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		outputAutomáticoPO = new OutputAutomaticoPO();

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		
		
		boolean sucesso = outputAutomáticoPO.editar();
		assertTrue(sucesso, Editar);

	}

}
