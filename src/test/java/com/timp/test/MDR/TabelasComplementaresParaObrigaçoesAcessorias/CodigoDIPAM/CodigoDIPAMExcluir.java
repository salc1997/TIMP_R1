package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDIPAM.CodigoDIPAMExcluirPO;

public class CodigoDIPAMExcluir extends TestBaseEliel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDIPAMExcluirPO codigoDIPAMExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDIPAMExcluirPO = new CodigoDIPAMExcluirPO();
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
	public void excluir() {

		
		boolean sucesso = codigoDIPAMExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		
	}			
  
}
