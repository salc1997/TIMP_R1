package com.timp.test.BRB.testNg;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.base.TestBaseParalelo2;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.prueba.AcessarBrbPO;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BRBAcessar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBRBPO;

	@BeforeClass
	public void beforeClass() {
		
		initialization();
		loginTC = new LoginTC();
		acessarBRBPO = new AcessarBrbPO();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test(priority = 1)
	public void login() {
		loginTC.login();
		
	}
	
	@Test(priority=2)
	public void brbEntrar() {
	
		
		boolean sucesso = acessarBRBPO.acessar();
		
		assertTrue(sucesso, semAcesso);

	
	}

}
