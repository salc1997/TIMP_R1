package com.timp.test.MDR.CenariosCorrecao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CenariosCorrecao.CenariosCorrecaoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CenariosCorrecaoEditar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CenariosCorrecaoEditarPO cenariosCorrecaoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cenariosCorrecaoEditarPO = new CenariosCorrecaoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso = cenariosCorrecaoEditarPO.cenariosCorrecaoEditar();
		assertTrue(sucesso, Editar);
		sleep(2000);
	}
}
