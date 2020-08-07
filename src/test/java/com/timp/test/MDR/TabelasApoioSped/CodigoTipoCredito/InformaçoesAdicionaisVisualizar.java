package com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito.Informa�oesAdicionaisVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class Informa�oesAdicionaisVisualizar extends TestBaseEliel {
  
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Informa�oesAdicionaisVisualizarPO informa�oesAdicionaisVisualizarPO;
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
	informa�oesAdicionaisVisualizarPO = new Informa�oesAdicionaisVisualizarPO();
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

		String sucesso = informa�oesAdicionaisVisualizarPO.visualizar();
		
		 assertEquals(sucesso, "forms-wrapper", visualiza�ar);
	}	
	
	

}
