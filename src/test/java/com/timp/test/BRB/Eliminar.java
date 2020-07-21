package com.timp.test.BRB;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRD.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRD.CriarCopiaPO;
import com.sap.timp.pageObjectModel.BRD.EliminarPO;

public class Eliminar extends TestBaseSteven{

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	EliminarPO eliminarPO;



    @BeforeClass
    public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		eliminarPO = new EliminarPO();
	

		
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
	public void eliminar() {
		boolean sucesso = eliminarPO.eliminar();
		
		assertTrue(sucesso, eliminar);
		
	
	}
	
	@Test(priority= 3)
	public void eliminarLixeira() {
		
		boolean sucesso = eliminarPO.eliminarLixeira();

		assertTrue(sucesso, eliminar);
		
	}
	
	
	
}
