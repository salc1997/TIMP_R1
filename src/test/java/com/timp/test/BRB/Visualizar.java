package com.timp.test.BRB;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.ExportarPO;
import com.sap.timp.pageObjectModel.BRB.VisualizarPO;

public class Visualizar extends TestBaseSteven{
	
	
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	VisualizarPO visualizarPO;




    @BeforeClass
    public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		visualizarPO = new VisualizarPO();
	

		
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
	public void visualizar(){
		
		boolean sucesso = true;
		sucesso = visualizarPO.visualizar();

		assertFalse(sucesso, visualizaçar);
		
	}	
		

}
