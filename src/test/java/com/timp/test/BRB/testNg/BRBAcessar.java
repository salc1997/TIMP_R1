package com.timp.test.BRB.testNg;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BRBAcessar extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	
	public BRBAcessar() {
		super();
	}
	


	@BeforeClass
	public void beforeClass() {
		
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
	}
	
	@AfterClass
	public void afterClass(){
		driver.close();
	}

	
	@Test(priority = 1)
	public void login() {
		loginTC.login();
		
	}
	
	@Test(priority=2)
	public void brbEntrar() {
		
		driver = initialization();
		
		boolean sucesso = acessarBrbPO.acessar();
		
		assertTrue(sucesso, semAcesso);
	
	
	}

}