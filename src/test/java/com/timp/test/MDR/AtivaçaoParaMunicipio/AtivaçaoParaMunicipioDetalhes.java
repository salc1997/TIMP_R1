package com.timp.test.MDR.AtivaçaoParaMunicipio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioDestalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class AtivaçaoParaMunicipioDetalhes extends TestBaseEliel{
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtivaçaoParaMunicipioDestalhesPO ativaçaoParaMunicipioDestalhesPO;
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ativaçaoParaMunicipioDestalhesPO = new AtivaçaoParaMunicipioDestalhesPO();
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
	public void Visualizar() {

		
		String sucesso = ativaçaoParaMunicipioDestalhesPO.detalhes();
		
		 assertEquals(sucesso, "edit", visualizaçar);
	}	
	
	

}
