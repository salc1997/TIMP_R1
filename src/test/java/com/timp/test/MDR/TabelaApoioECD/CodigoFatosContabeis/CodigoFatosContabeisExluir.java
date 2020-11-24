package com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis;

import org.testng.annotations.Test;
 
import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisExluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoFatosContabeisExluir extends TestBaseFernando {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	CodigoFatosContabeisExluirPO codigoFatosContabeisExluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		codigoFatosContabeisExluirPO = new CodigoFatosContabeisExluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarMDR() {
		accesarMDRPO.acessarMDR();
	}

	@Test(priority = 2)
	public void excluirCodigoFatosContabeis() {
		boolean sucesso = codigoFatosContabeisExluirPO.excluirCodigoFatosContabeis();
		assertTrue(sucesso, excluirVariante);
	}
}
