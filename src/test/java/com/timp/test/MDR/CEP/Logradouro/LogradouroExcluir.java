package com.timp.test.MDR.CEP.Logradouro;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Logradouro.LogradouroExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class LogradouroExcluir extends TestBaseKathy{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LogradouroExcluirPO logradouroExcluirPO;
	
    @BeforeClass
    public void beforeClass() {
    	driver = initializationK();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		logradouroExcluirPO = new LogradouroExcluirPO();
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
    public void logradouroExcluir() {
    	boolean sucesso = logradouroExcluirPO.logradouroExcluir();
		assertTrue(sucesso, Eliminado);
    }

}