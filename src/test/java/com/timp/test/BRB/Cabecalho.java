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
	cabecalhoPO cabe�alhoPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		cabe�alhoPO = new cabecalhoPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void cabe�alho() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		
		cabe�alhoPO.cabe�alho();
		sleep(2000);

	}

}
