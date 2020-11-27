package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO;

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPasta extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO parametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		parametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO = new ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		acessarDFGPO.acessarDFG();
	}

	@Test(priority = 2)
	public void criarGerenciarMoverPasta() {
		boolean sucesso = parametrosGeraisCriarRaizIDPúblicoPrivadoCriarMoverGerenciarPastaPO.criarGerenciarMoverPasta();
		assertTrue(sucesso, Criar);
	}
}
