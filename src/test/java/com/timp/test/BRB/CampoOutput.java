package com.timp.test.BRB;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRD.*;

public class CampoOutput extends TestBase{
	
	
	
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	CampoOutputPO campoOutputPO;


    @BeforeClass
    public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		campoOutputPO = new CampoOutputPO();

	

		
    }
  
    @AfterClass
	public void afterClass(){
		driver.close();
	}
   
    @Test(priority = 0)
	public void login() {

		loginTC.login();

	}
	
	
	@Test(priority= 1)
	public void brbEntrar() {
		acessarBrbPO.acessar();
			
	}
	

	@Test(priority= 2)
	public void campoOutput() {
		
		boolean sucesso = campoOutputPO.agregarOutput();
		
		
		assertTrue(sucesso, semCampoOutput);
			
	}
	
	
	

}
