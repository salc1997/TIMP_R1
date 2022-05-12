package com.timp.test.TFB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFB.AccesarTFBPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AccesarTFB extends TestBaseMassiel{
	LoginTC loginTC;
	AccesarTFBPO accesarTFBPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  accesarTFBPO = new AccesarTFBPO();
  }

  @AfterClass
  public void afterClass() {
  }
 
  @Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void tfbEntrar() {
		boolean sucesso =  accesarTFBPO.acessarTFB();
		assertTrue(sucesso, "The element is not present");
	}
}
