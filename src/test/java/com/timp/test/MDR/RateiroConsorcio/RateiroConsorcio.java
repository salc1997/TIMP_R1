package com.timp.test.MDR.RateiroConsorcio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.RateiroConsorcio.RateiroConsorcioPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RateiroConsorcio extends TestBaseMassiel {
	
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	RateiroConsorcioPO rateiroConsorcioPO;
	
	 @BeforeClass
	    public void beforeClass() {
		  driver = initializationM();
		  accesarMDRPO = new AcessarMDRPO();
		  loginTC = new LoginTC();
		  rateiroConsorcioPO = new  RateiroConsorcioPO();
	  }
	 
	@AfterClass
	  public void afterClass() {
		//cerrar navegador
		//driver.quit();
	  }
	
    @Test(priority = 0)
     public void ingresar() {
		loginTC.login();
	}
    
    @Test(priority = 1)
	public void ingresarMDR() {
		accesarMDRPO.acessarMDR();
	}
    
    @Test(priority = 2)
   	public void criar() {
    	 rateiroConsorcioPO.Criar();
   	}
    
    
	
   
 
  

}
