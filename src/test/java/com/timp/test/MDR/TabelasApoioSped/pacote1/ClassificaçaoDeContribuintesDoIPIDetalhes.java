package com.timp.test.MDR.TabelasApoioSped.pacote1;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.pacote1.Classifica�aoDeContribuintesDoIPIDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class Classifica�aoDeContribuintesDoIPIDetalhes extends TestBaseEliel {
  

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Classifica�aoDeContribuintesDoIPIDetalhesPO classifica�aoDeContribuintesDoIPIDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classifica�aoDeContribuintesDoIPIDetalhesPO = new Classifica�aoDeContribuintesDoIPIDetalhesPO();
	}
	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
	 */

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void detalhes() {

		String sucesso = classifica�aoDeContribuintesDoIPIDetalhesPO.detalhes();
		
		 assertEquals(sucesso, "edit", visualiza�ar);
		
	}	
	
	
	
	
}
