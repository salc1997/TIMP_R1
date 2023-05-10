package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.AtribuicaodeRegraPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AtribuicaodeRegra extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	AtribuicaodeRegraPO atribui��odeRegraPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		atribui��odeRegraPO = new AtribuicaodeRegraPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {		
		loginTC.login();		
		acessarBrbPO.acessar();		

		boolean sucesso = atribui��odeRegraPO.editar();
		assertTrue(sucesso, Editar);
		sleep(2000);
	}

}
