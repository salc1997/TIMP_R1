package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.AtribuicaodeRegraPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AtribuicaodeRegra extends TestBase {
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	AtribuicaodeRegraPO atribuiçãodeRegraPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		atribuiçãodeRegraPO = new AtribuicaodeRegraPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {		
		loginTC.login();		
		acessarBrbPO.acessar();		

		boolean sucesso = atribuiçãodeRegraPO.editar();
		assertTrue(sucesso, Editar);
		sleep(2000);
	}

}
