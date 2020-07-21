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
import com.sap.timp.pageObjectModel.BRD.CampoOutputPO;
import com.sap.timp.pageObjectModel.BRD.FormatacaoEVariantePO;

public class FormatacaoEVariante extends TestBaseSteven{
	
	
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	FormatacaoEVariantePO formatacaoEVariantePO;


    @BeforeClass
    public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		formatacaoEVariantePO = new FormatacaoEVariantePO();
		
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
	public void formatacaoEVariante() {
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso = formatacaoEVariantePO.formatacaoEVariante();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), formatação);
		}
		
		ArrayList<Boolean> sucesso2 = new ArrayList<Boolean>();
		sucesso2 = formatacaoEVariantePO.salvarVariante();
		
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), salvarVariante);
		}
		
		
			
	}
	@Test(priority = 3)
	public void excluirVariante() {
		
		boolean sucesso = false;
		
		sucesso = formatacaoEVariantePO.excluirVariantes();
		
		assertTrue(sucesso, excluirVariante);
		
		
		
	}
	
	
	
	

}
