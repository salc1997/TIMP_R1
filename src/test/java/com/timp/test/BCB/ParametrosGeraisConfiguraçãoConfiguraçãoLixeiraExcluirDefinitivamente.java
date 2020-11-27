package com.timp.test.BCB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamentePO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfigura��oConfigura��oRaizPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamente extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamentePO parametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamentePO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamentePO = new ParametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamentePO();


	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);

	}
	
	@Test(priority = 2)
	public void criarConfiguracao() {
		boolean sucesso = parametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamentePO.lixeiraExcluirDefinitivamenteConfiguracao();

		assertTrue(sucesso, Eliminado);
	}

}
