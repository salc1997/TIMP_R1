package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFDetalhesPO;

public class TabelaComplementarParaDIRFDetalhes extends TestBaseEliel{

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaComplementarParaDIRFDetalhesPO tabelaComplementarParaDIRFDetalhesPO;
	
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaComplementarParaDIRFDetalhesPO = new TabelaComplementarParaDIRFDetalhesPO();
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
	public void Detalhes() {

		ArrayList<Boolean> sucesso = tabelaComplementarParaDIRFDetalhesPO.detalhes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			
			assertTrue(sucesso.get(i), Detalhes);
			
		}
	}		
	
	
	
	
	
}
