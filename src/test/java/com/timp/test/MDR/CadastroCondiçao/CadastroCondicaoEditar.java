package com.timp.test.MDR.CadastroCondiçao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondiçao.CadastroCondicaoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroCondicaoEditar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroCondicaoEditarPO cadastroCondicaoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroCondicaoEditarPO = new CadastroCondicaoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = cadastroCondicaoEditarPO.editar();

		assertTrue(sucesso, Editar);


	}

}
