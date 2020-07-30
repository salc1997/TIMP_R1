package com.timp.test.MDR.Centralizacao.FatorCreditamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoFiltrosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FatorCreditamentoFiltros extends TestBaseKathy{
	LoginTC loginTC;
  	AcessarMDRPO acessarMDRPO;
  	FatorCreditamentoFiltrosPO fatorCreditamentoFiltrosPO;
  	
    @BeforeClass
    public void beforeClass() {
    	driver = initializationK();
	  	loginTC = new LoginTC();
	  	acessarMDRPO = new AcessarMDRPO();
	  	fatorCreditamentoFiltrosPO = new FatorCreditamentoFiltrosPO();
    }

    @AfterClass
    public void afterClass() {
    }
    
    @Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void acessarMDR() {
		acessarMDRPO.acessarMDR();
	}
	
	@Test(priority = 2)
    public void fatorCreditamentoFiltros() {
		boolean sucesso =  fatorCreditamentoFiltrosPO.fatorCrecimentoFiltros();
		assertTrue(sucesso, Filtros);
    }

}
