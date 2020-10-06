package com.timp.test.MDR.CenariosCorrecao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CenariosCorrecao.CenariosCorrecaoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CenariosCorrecaoExcluir extends TestBaseKathy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CenariosCorrecaoExcluirPO cenariosCorrecaoExcluirPO;
  
    @BeforeClass
    public void beforeClass() {
    	driver = initializationK();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cenariosCorrecaoExcluirPO = new CenariosCorrecaoExcluirPO();
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
    public void excluir() {
    	boolean sucesso = cenariosCorrecaoExcluirPO.cenariosCorrecaoExcluir();
		assertTrue(sucesso, Eliminado);
    }

}
