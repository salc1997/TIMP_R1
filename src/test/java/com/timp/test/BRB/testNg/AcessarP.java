package com.timp.test.BRB.testNg;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.prueba.*;

public class AcessarP extends TestBaseSteven{
	AcessarBrbPO acessarBrbPO;



	@BeforeClass
	public void beforeClass() {
		driver = initialization();

		acessarBrbPO = new AcessarBrbPO();
	}
	
	@AfterClass
	public void afterClass(){
		driver.close();
	}
	
	@Test
	public void brbEntrar() {
		
		boolean sucesso = acessarBrbPO.acessar();
		
		assertTrue(sucesso, semAcesso);
	
	
	}

}
