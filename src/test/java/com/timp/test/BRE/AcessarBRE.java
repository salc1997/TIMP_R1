package com.timp.test.BRE;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;

public class AcessarBRE extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;

	public AcessarBRE() {
		super();
	}

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void MDREntrar() {

		boolean sucesso = acessarBREPO.acessarBRE();
		assertTrue(sucesso, "Elemento não Econtrado");

	}

}
