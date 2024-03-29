package com.timp.test.BSC;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarBSC extends TestBase{
	LoginTC loginTC;
	AcessarBSCPO acessarBSC;

  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarBSC = new  AcessarBSCPO();
  }

  @AfterClass
  public void afterClass() {
  }

  @Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void BSCEntrar() {

		
		boolean sucesso =  acessarBSC.acessarBSC();
		assertTrue(sucesso, "The element is not present");

	}
}
