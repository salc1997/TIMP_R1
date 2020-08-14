package com.timp.test.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores.AjusteEInforma�oesDeValoresDetalhesPO;


public class AjusteEInforma�oesDeValoresDetalhes extends TestBaseEliel {
  
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AjusteEInforma�oesDeValoresDetalhesPO ajusteEInforma�oesDeValoresDetalhesPO;
	
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ajusteEInforma�oesDeValoresDetalhesPO = new AjusteEInforma�oesDeValoresDetalhesPO();
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

		
		String sucesso = ajusteEInforma�oesDeValoresDetalhesPO.detalhes();
		
		 assertEquals(sucesso, "edit", visualiza�ar);
	}	
				
	
	
}
