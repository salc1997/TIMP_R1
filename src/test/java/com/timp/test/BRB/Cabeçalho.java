package com.timp.test.BRB;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRD.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRD.RegrasPO;
import com.sap.timp.pageObjectModel.BRD.cabeçalhoPO;

public class Cabeçalho extends TestBase{

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	cabeçalhoPO cabeçalhoPO;
	


	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		cabeçalhoPO = new cabeçalhoPO();

	}
	
	@AfterClass
	public void afterClass(){
		driver.close();
	}
	
	
	@Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {

		acessarBrbPO.acessar();

	}
	
	@Test(priority = 2)
	public void cabeçalho() {
		cabeçalhoPO.cabeçalho();
	}
	
	
	
	
	
	
	
}
