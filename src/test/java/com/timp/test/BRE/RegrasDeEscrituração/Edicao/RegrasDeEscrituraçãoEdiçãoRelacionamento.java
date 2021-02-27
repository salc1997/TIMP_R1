package com.timp.test.BRE.RegrasDeEscritura��o.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.Edicao.RegrasDeEscritura��oEdi��oRelacionamentoPO;

public class RegrasDeEscritura��oEdi��oRelacionamento extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscritura��oEdi��oRelacionamentoPO regrasDeEscritura��oEdi��oRelacionamentoPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscritura��oEdi��oRelacionamentoPO = new RegrasDeEscritura��oEdi��oRelacionamentoPO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void acessarBRE() {
		acessarBREPO.acessarBRE();
	}
	
	@Test(priority = 2)
	public void relacionamento() {
		boolean sucesso = regrasDeEscritura��oEdi��oRelacionamentoPO.relacionamento();
		assertTrue(sucesso, Criar);
	}
}
