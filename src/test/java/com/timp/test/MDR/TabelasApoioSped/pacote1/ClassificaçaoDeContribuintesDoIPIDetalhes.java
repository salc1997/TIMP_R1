package com.timp.test.MDR.TabelasApoioSped.pacote1;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.pacote1.ClassificaçaoDeContribuintesDoIPIDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class ClassificaçaoDeContribuintesDoIPIDetalhes extends TestBaseEliel {
  

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ClassificaçaoDeContribuintesDoIPIDetalhesPO classificaçaoDeContribuintesDoIPIDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classificaçaoDeContribuintesDoIPIDetalhesPO = new ClassificaçaoDeContribuintesDoIPIDetalhesPO();
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

		String sucesso = classificaçaoDeContribuintesDoIPIDetalhesPO.detalhes();
		
		 assertEquals(sucesso, "edit", visualizaçar);
		
	}	
	
	
	
	
}
