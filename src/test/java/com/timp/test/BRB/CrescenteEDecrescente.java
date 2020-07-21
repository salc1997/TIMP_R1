package com.timp.test.BRB;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRD.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRD.CrescenteEDecrescentePO;

public class CrescenteEDecrescente extends TestBase{
	

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	CrescenteEDecrescentePO crescenteEDecrescentePO;


    @BeforeClass
    public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		crescenteEDecrescentePO = new CrescenteEDecrescentePO();
		
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
	public void crescenteEDecrescente() {
	
		ArrayList<Boolean> sucesso = crescenteEDecrescentePO.crescente();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), crescenteEDecrescente);
		}
		
		ArrayList<Boolean> sucesso2 = crescenteEDecrescentePO.decrescente();
		

		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), crescenteEDecrescente);
		}
		
	}

}
