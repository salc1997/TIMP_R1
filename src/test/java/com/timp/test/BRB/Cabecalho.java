package com.timp.test.BRB;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.cabecalhoPO;

public class Cabecalho extends TestBase {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	cabecalhoPO cabeçalhoPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		cabeçalhoPO = new cabecalhoPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void cabeçalho() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		
		cabeçalhoPO.cabeçalho();
		sleep(2000);

	}

}
