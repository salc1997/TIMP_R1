package com.timp.test.BRE.CalculoDeTributos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.CalculodeTributosEdiçãoRelacionamentoPO;

public class CalculodeTributosEdiçãoRelacionamento extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	CalculodeTributosEdiçãoRelacionamentoPO calculodeTributosEdiçãoRelacionamentoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		calculodeTributosEdiçãoRelacionamentoPO = new CalculodeTributosEdiçãoRelacionamentoPO();
	}


	@AfterClass
	public void afterClass() {
		driver.close();
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
	public void editar() {
		boolean sucesso = calculodeTributosEdiçãoRelacionamentoPO.relacionamiento();
		assertTrue(sucesso, Editar);
	}
}
