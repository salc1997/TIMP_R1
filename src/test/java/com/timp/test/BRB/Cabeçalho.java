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
import com.sap.timp.pageObjectModel.BRD.cabe�alhoPO;

public class Cabe�alho extends TestBase{

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	cabe�alhoPO cabe�alhoPO;
	


	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		cabe�alhoPO = new cabe�alhoPO();

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
	public void cabe�alho() {
		cabe�alhoPO.cabe�alho();
	}
	
	
	
	
	
	
	
}
