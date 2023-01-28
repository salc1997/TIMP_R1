package com.timp.test.BRB;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.RegrasPO;
import com.sap.timp.pageObjectModel.BRB.cabecalhoPO;

public class Cabecalho extends TestBaseSteven {

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
