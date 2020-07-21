package com.timp.test.BRB;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRD.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRD.AgrupadoPeloCampoPO;

public class AgrupadoPeloCampo extends TestBaseSteven{

	
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	AgrupadoPeloCampoPO agrupadoPeloCampoPO;




    @BeforeClass
    public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		agrupadoPeloCampoPO = new AgrupadoPeloCampoPO();

	

		
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
	public void agrupadoPeloCampo() {
		agrupadoPeloCampoPO.agrupar();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso = agrupadoPeloCampoPO.sucesso();
		
		ArrayList<Boolean> sucesso2 = new ArrayList<Boolean>();
		sucesso2 = agrupadoPeloCampoPO.sucesso2();
		

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), elementosDiferentes);
			
		}
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), elementosDiferentes);
		}
		
		
		agrupadoPeloCampoPO.excluirGrupo();
			
	}
	
	
	
	
	
	
	
}
