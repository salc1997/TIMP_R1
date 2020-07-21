package com.timp.test.BRB;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.ImprimirPO;

public class Imprimir extends TestBaseSteven {
	
	
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	ImprimirPO imprimirPO;




    @BeforeClass
    public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		imprimirPO = new ImprimirPO();
	

		
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
	
	@Test(priority = 2)
	public void imprimir() {
		imprimirPO.imprimir();
	}
	

}
