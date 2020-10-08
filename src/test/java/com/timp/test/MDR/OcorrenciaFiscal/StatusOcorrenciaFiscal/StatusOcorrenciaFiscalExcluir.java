package com.timp.test.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcorrenciaFiscalExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelasOutrosDebitosCriarPO;

public class StatusOcorrenciaFiscalExcluir extends TestBaseSteven {
 
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	StatusOcorrenciaFiscalExcluirPO statusOcorrenciaFiscalExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		statusOcorrenciaFiscalExcluirPO = new StatusOcorrenciaFiscalExcluirPO();
	}
	
	  @AfterClass public void afterClass(){ driver.close(); }
	 

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

		
		boolean sucesso = statusOcorrenciaFiscalExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		
	}			
		
	
	
}
